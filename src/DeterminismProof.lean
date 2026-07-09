namespace DeterminismProof

abbrev Var := String
abbrev State := Var -> Int

inductive Expr where
  | num : Int -> Expr
  | var : Var -> Expr
  | add : Expr -> Expr -> Expr
  | lt  : Expr -> Expr -> Expr
  deriving Repr

inductive Stmt where
  | assign : Var -> Expr -> Stmt
  | seq    : Stmt -> Stmt -> Stmt
  | ifElse : Expr -> Stmt -> Stmt -> Stmt
  | while  : Expr -> Stmt -> Stmt
  deriving Repr

def evalExpr (e : Expr) (s : State) : Int :=
  match e with
  | Expr.num n => n
  | Expr.var x => s x
  | Expr.add e1 e2 => evalExpr e1 s + evalExpr e2 s
  | Expr.lt e1 e2 =>
      if evalExpr e1 s < evalExpr e2 s then 1 else 0

def update (s : State) (x : Var) (v : Int) : State :=
  fun y => if y == x then v else s y

inductive BigStep : Stmt -> State -> State -> Prop where
  | assign : forall x e s,
      BigStep
        (Stmt.assign x e)
        s
        (update s x (evalExpr e s))

  | seq : forall S1 S2 s smid sout,
      BigStep S1 s smid ->
      BigStep S2 smid sout ->
      BigStep (Stmt.seq S1 S2) s sout

  | ifTrue : forall b S1 S2 s sout,
      evalExpr b s ≠ 0 ->
      BigStep S1 s sout ->
      BigStep (Stmt.ifElse b S1 S2) s sout

  | ifFalse : forall b S1 S2 s sout,
      evalExpr b s = 0 ->
      BigStep S2 s sout ->
      BigStep (Stmt.ifElse b S1 S2) s sout

  | whileF : forall b S s,
      evalExpr b s = 0 ->
      BigStep (Stmt.while b S) s s

  | whileT : forall b S s smid sout,
      evalExpr b s ≠ 0 ->
      BigStep S s smid ->
      BigStep (Stmt.while b S) smid sout ->
      BigStep (Stmt.while b S) s sout

theorem determinism :
    forall {S s s1 s2},
      BigStep S s s1 -> BigStep S s s2 -> s1 = s2 := by
  intro S s s1 s2 h1
  induction h1 generalizing s2 with

  | assign x e s =>
      intro h2
      cases h2 with
      | assign x e s =>
          rfl

  | seq S1 S2 s smid sout hFirst1 hSecond1 ihFirst ihSecond =>
      intro h2
      cases h2 with
      | seq S1' S2' s' smid2 sout2 hFirst2 hSecond2 =>
          have hmid : smid = smid2 := ihFirst hFirst2
          cases hmid
          exact ihSecond hSecond2

  | ifTrue b S1 S2 s sout hb hThen ihThen =>
      intro h2
      cases h2 with
      | ifTrue b' S1' S2' s' sout2 hb2 hThen2 =>
          exact ihThen hThen2
      | ifFalse b' S1' S2' s' sout2 hb0 hElse2 =>
          exact False.elim (hb hb0)

  | ifFalse b S1 S2 s sout hb hElse ihElse =>
      intro h2
      cases h2 with
      | ifTrue b' S1' S2' s' sout2 hbNonZero hThen2 =>
          exact False.elim (hbNonZero hb)
      | ifFalse b' S1' S2' s' sout2 hb2 hElse2 =>
          exact ihElse hElse2

  | whileF b S s hb =>
      intro h2
      cases h2 with
      | whileF b' S' s' hb2 =>
          rfl
      | whileT b' S' s' smid2 sout2 hbNonZero hBody hLoop =>
          exact False.elim (hbNonZero hb)

  | whileT b S s smid sout hb hBody1 hLoop1 ihBody ihLoop =>
      intro h2
      cases h2 with
      | whileF b' S' s' hb0 =>
          exact False.elim (hb hb0)
      | whileT b' S' s' smid2 sout2 hb2 hBody2 hLoop2 =>
          have hmid : smid = smid2 := ihBody hBody2
          cases hmid
          exact ihLoop hLoop2

end DeterminismProof