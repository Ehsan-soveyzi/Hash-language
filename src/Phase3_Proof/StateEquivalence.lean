namespace StateEquivalenceProof

abbrev Var := String
abbrev State := Var → Int

inductive Expr where
  | num : Int → Expr
  | var : Var → Expr
  | add : Expr → Expr → Expr
  | mul : Expr → Expr → Expr
  | lt  : Expr → Expr → Expr
  | eq  : Expr → Expr → Expr

def evalExpr : Expr → State → Int
  | .num n, _ => n
  | .var x, s => s x
  | .add e₁ e₂, s => evalExpr e₁ s + evalExpr e₂ s
  | .mul e₁ e₂, s => evalExpr e₁ s * evalExpr e₂ s
  | .lt e₁ e₂, s => if evalExpr e₁ s < evalExpr e₂ s then 1 else 0
  | .eq e₁ e₂, s => if evalExpr e₁ s = evalExpr e₂ s then 1 else 0

inductive Stmt where
  | assign : Var → Expr → Stmt
  | seq : Stmt → Stmt → Stmt
  | ifElse : Expr → Stmt → Stmt → Stmt
  | while : Expr → Stmt → Stmt

def update (s : State) (x : Var) (v : Int) : State :=
  fun y => if y = x then v else s y

inductive BigStep : Stmt → State → State → Prop where
  | assign (x : Var) (e : Expr) (s : State) :
      BigStep (.assign x e) s (update s x (evalExpr e s))
  | seq (S₁ S₂ : Stmt) (s smid sout : State) :
      BigStep S₁ s smid →
      BigStep S₂ smid sout →
      BigStep (.seq S₁ S₂) s sout
  | ifTrue (b : Expr) (S₁ S₂ : Stmt) (s sout : State) :
      evalExpr b s ≠ 0 →
      BigStep S₁ s sout →
      BigStep (.ifElse b S₁ S₂) s sout
  | ifFalse (b : Expr) (S₁ S₂ : Stmt) (s sout : State) :
      evalExpr b s = 0 →
      BigStep S₂ s sout →
      BigStep (.ifElse b S₁ S₂) s sout
  | whileFalse (b : Expr) (body : Stmt) (s : State) :
      evalExpr b s = 0 →
      BigStep (.while b body) s s
  | whileTrue (b : Expr) (body : Stmt) (s smid sout : State) :
      evalExpr b s ≠ 0 →
      BigStep body s smid →
      BigStep (.while b body) smid sout →
      BigStep (.while b body) s sout

def freeVarsExpr : Expr → Var → Prop
  | .num _, _ => False
  | .var y, x => x = y
  | .add e₁ e₂, x => freeVarsExpr e₁ x ∨ freeVarsExpr e₂ x
  | .mul e₁ e₂, x => freeVarsExpr e₁ x ∨ freeVarsExpr e₂ x
  | .lt e₁ e₂, x => freeVarsExpr e₁ x ∨ freeVarsExpr e₂ x
  | .eq e₁ e₂, x => freeVarsExpr e₁ x ∨ freeVarsExpr e₂ x

def freeVarsStmt : Stmt → Var → Prop
  | .assign y e, x => x = y ∨ freeVarsExpr e x
  | .seq S₁ S₂, x => freeVarsStmt S₁ x ∨ freeVarsStmt S₂ x
  | .ifElse b S₁ S₂, x =>
      freeVarsExpr b x ∨ freeVarsStmt S₁ x ∨ freeVarsStmt S₂ x
  | .while b body, x => freeVarsExpr b x ∨ freeVarsStmt body x

def AgreeOn (P : Var → Prop) (s₁ s₂ : State) : Prop :=
  ∀ x, P x → s₁ x = s₂ x

theorem state_equivalence :
    ∀ {S : Stmt} {s₁ s₂ t₁ : State},
      AgreeOn (freeVarsStmt S) s₁ s₂ →
      BigStep S s₁ t₁ →
      ∃ t₂, BigStep S s₂ t₂ ∧ AgreeOn (freeVarsStmt S) t₁ t₂ := by
  have eval_eq :
      ∀ {e : Expr} {s₁ s₂ : State},
        AgreeOn (freeVarsExpr e) s₁ s₂ →
        evalExpr e s₁ = evalExpr e s₂ := by
    intro e
    induction e with
    | num n =>
        intro s₁ s₂ h
        rfl
    | var x =>
        intro s₁ s₂ h
        exact h x rfl
    | add e₁ e₂ ih₁ ih₂ =>
        intro s₁ s₂ h
        have h₁ : AgreeOn (freeVarsExpr e₁) s₁ s₂ :=
          fun x hx => h x (Or.inl hx)
        have h₂ : AgreeOn (freeVarsExpr e₂) s₁ s₂ :=
          fun x hx => h x (Or.inr hx)
        simp [evalExpr, ih₁ h₁, ih₂ h₂]
    | mul e₁ e₂ ih₁ ih₂ =>
        intro s₁ s₂ h
        have h₁ : AgreeOn (freeVarsExpr e₁) s₁ s₂ :=
          fun x hx => h x (Or.inl hx)
        have h₂ : AgreeOn (freeVarsExpr e₂) s₁ s₂ :=
          fun x hx => h x (Or.inr hx)
        simp [evalExpr, ih₁ h₁, ih₂ h₂]
    | lt e₁ e₂ ih₁ ih₂ =>
        intro s₁ s₂ h
        have h₁ : AgreeOn (freeVarsExpr e₁) s₁ s₂ :=
          fun x hx => h x (Or.inl hx)
        have h₂ : AgreeOn (freeVarsExpr e₂) s₁ s₂ :=
          fun x hx => h x (Or.inr hx)
        simp [evalExpr, ih₁ h₁, ih₂ h₂]
    | eq e₁ e₂ ih₁ ih₂ =>
        intro s₁ s₂ h
        have h₁ : AgreeOn (freeVarsExpr e₁) s₁ s₂ :=
          fun x hx => h x (Or.inl hx)
        have h₂ : AgreeOn (freeVarsExpr e₂) s₁ s₂ :=
          fun x hx => h x (Or.inr hx)
        simp [evalExpr, ih₁ h₁, ih₂ h₂]

  have aux :
      ∀ {S : Stmt} {s₁ t₁ : State},
        BigStep S s₁ t₁ →
        ∀ (P : Var → Prop) (s₂ : State),
          (∀ x, freeVarsStmt S x → P x) →
          AgreeOn P s₁ s₂ →
          ∃ t₂, BigStep S s₂ t₂ ∧ AgreeOn P t₁ t₂ := by
    intro S s₁ t₁ hExec
    induction hExec with
    | assign x e s =>
        intro P s₂ hSub hAgree
        have hEval : evalExpr e s = evalExpr e s₂ :=
          eval_eq (fun y hy => hAgree y (hSub y (Or.inr hy)))
        refine ⟨update s₂ x (evalExpr e s₂), BigStep.assign x e s₂, ?_⟩
        intro y hy
        by_cases hxy : y = x
        · subst y
          simp [update, hEval]
        · simp [update, hxy, hAgree y hy]

    | seq S₁ S₂ s smid sout hFirst hSecond ihFirst ihSecond =>
        intro P s₂ hSub hAgree
        have hSub₁ : ∀ x, freeVarsStmt S₁ x → P x :=
          fun x hx => hSub x (Or.inl hx)
        rcases ihFirst P s₂ hSub₁ hAgree with
          ⟨smid₂, hFirst₂, hMidAgree⟩
        have hSub₂ : ∀ x, freeVarsStmt S₂ x → P x :=
          fun x hx => hSub x (Or.inr hx)
        rcases ihSecond P smid₂ hSub₂ hMidAgree with
          ⟨t₂, hSecond₂, hFinalAgree⟩
        exact ⟨t₂,
          BigStep.seq S₁ S₂ s₂ smid₂ t₂ hFirst₂ hSecond₂,
          hFinalAgree⟩

    | ifTrue b S₁ S₂ s sout hGuard hThen ihThen =>
        intro P s₂ hSub hAgree
        have hGuardEq : evalExpr b s = evalExpr b s₂ :=
          eval_eq (fun x hx => hAgree x (hSub x (Or.inl hx)))
        have hGuard₂ : evalExpr b s₂ ≠ 0 := by
          intro hz
          exact hGuard (hGuardEq.trans hz)
        have hSubThen : ∀ x, freeVarsStmt S₁ x → P x :=
          fun x hx => hSub x (Or.inr (Or.inl hx))
        rcases ihThen P s₂ hSubThen hAgree with
          ⟨t₂, hThen₂, hFinalAgree⟩
        exact ⟨t₂,
          BigStep.ifTrue b S₁ S₂ s₂ t₂ hGuard₂ hThen₂,
          hFinalAgree⟩

    | ifFalse b S₁ S₂ s sout hGuard hElse ihElse =>
        intro P s₂ hSub hAgree
        have hGuardEq : evalExpr b s = evalExpr b s₂ :=
          eval_eq (fun x hx => hAgree x (hSub x (Or.inl hx)))
        have hGuard₂ : evalExpr b s₂ = 0 :=
          hGuardEq.symm.trans hGuard
        have hSubElse : ∀ x, freeVarsStmt S₂ x → P x :=
          fun x hx => hSub x (Or.inr (Or.inr hx))
        rcases ihElse P s₂ hSubElse hAgree with
          ⟨t₂, hElse₂, hFinalAgree⟩
        exact ⟨t₂,
          BigStep.ifFalse b S₁ S₂ s₂ t₂ hGuard₂ hElse₂,
          hFinalAgree⟩

    | whileFalse b body s hGuard =>
        intro P s₂ hSub hAgree
        have hGuardEq : evalExpr b s = evalExpr b s₂ :=
          eval_eq (fun x hx => hAgree x (hSub x (Or.inl hx)))
        have hGuard₂ : evalExpr b s₂ = 0 :=
          hGuardEq.symm.trans hGuard
        exact ⟨s₂, BigStep.whileFalse b body s₂ hGuard₂, hAgree⟩

    | whileTrue b body s smid sout hGuard hBody hRest ihBody ihRest =>
        intro P s₂ hSub hAgree
        have hGuardEq : evalExpr b s = evalExpr b s₂ :=
          eval_eq (fun x hx => hAgree x (hSub x (Or.inl hx)))
        have hGuard₂ : evalExpr b s₂ ≠ 0 := by
          intro hz
          exact hGuard (hGuardEq.trans hz)
        have hSubBody : ∀ x, freeVarsStmt body x → P x :=
          fun x hx => hSub x (Or.inr hx)
        rcases ihBody P s₂ hSubBody hAgree with
          ⟨smid₂, hBody₂, hMidAgree⟩
        rcases ihRest P smid₂ hSub hMidAgree with
          ⟨t₂, hRest₂, hFinalAgree⟩
        exact ⟨t₂,
          BigStep.whileTrue b body s₂ smid₂ t₂
            hGuard₂ hBody₂ hRest₂,
          hFinalAgree⟩

  intro S s₁ s₂ t₁ hInitial hExec
  exact aux hExec (freeVarsStmt S) s₂ (fun _ hx => hx) hInitial

end StateEquivalenceProof
