/-
  Phase 3 - Formal Proof in Lean 4
  Chosen theorem: Expression Determinism

  Meaning of the theorem:
  If an expression e is evaluated in the same state s twice,
  and the first evaluation produces v1 while the second produces v2,
  then v1 = v2.
-/

namespace ExpressionDeterminismProof

/-- Variable names in Hash are modeled as strings. -/
abbrev Var := String

/-- A program state maps each variable name to an integer value. -/
abbrev State := Var -> Int

/--
  Expressions of the selected Hash subset.
  Boolean results are represented as integers:
  true  = 1
  false = 0
-/
inductive Expr where
  | num : Int -> Expr
  | var : Var -> Expr
  | add : Expr -> Expr -> Expr
  | mul : Expr -> Expr -> Expr
  | lt  : Expr -> Expr -> Expr
  | eq  : Expr -> Expr -> Expr
  deriving Repr

/--
  A deterministic executable evaluator for expressions.
  This is useful as a reference meaning for the relational rules below.
-/
def evalExpr (e : Expr) (s : State) : Int :=
  match e with
  | Expr.num n => n
  | Expr.var x => s x
  | Expr.add e1 e2 => evalExpr e1 s + evalExpr e2 s
  | Expr.mul e1 e2 => evalExpr e1 s * evalExpr e2 s
  | Expr.lt e1 e2 =>
      if evalExpr e1 s < evalExpr e2 s then 1 else 0
  | Expr.eq e1 e2 =>
      if evalExpr e1 s = evalExpr e2 s then 1 else 0

/--
  Relational big-step evaluation for expressions.
  `EvalExpr e s v` means:
  expression `e` evaluates to value `v` in state `s`.
-/
inductive EvalExpr : Expr -> State -> Int -> Prop where
  | num : forall (n : Int) (s : State),
      EvalExpr (Expr.num n) s n

  | var : forall (x : Var) (s : State),
      EvalExpr (Expr.var x) s (s x)

  | add : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.add e1 e2) s (v1 + v2)

  | mul : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.mul e1 e2) s (v1 * v2)

  | lt : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.lt e1 e2) s (if v1 < v2 then 1 else 0)

  | eq : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.eq e1 e2) s (if v1 = v2 then 1 else 0)

/--
  This theorem connects the relational evaluator `EvalExpr`
  to the deterministic function `evalExpr`.

  It says: if the relation says that e evaluates to v,
  then v is exactly the value produced by the function evalExpr.
-/
theorem evalExpr_sound :
    forall {e : Expr} {s : State} {v : Int},
      EvalExpr e s v -> v = evalExpr e s := by
  intro e s v h
  induction h with
  | num n s =>
      rfl
  | var x s =>
      rfl
  | add e1 e2 s v1 v2 h1 h2 ih1 ih2 =>
      simp [evalExpr, ih1, ih2]
  | mul e1 e2 s v1 v2 h1 h2 ih1 ih2 =>
      simp [evalExpr, ih1, ih2]
  | lt e1 e2 s v1 v2 h1 h2 ih1 ih2 =>
      simp [evalExpr, ih1, ih2]
  | eq e1 e2 s v1 v2 h1 h2 ih1 ih2 =>
      simp [evalExpr, ih1, ih2]

/--
  Chosen theorem for Phase 3: Expression Determinism.

  If the same expression `e` is evaluated in the same state `s`
  and produces `v1` in one derivation and `v2` in another derivation,
  then the two results must be equal.
-/
theorem expression_determinism :
    forall {e : Expr} {s : State} {v1 v2 : Int},
      EvalExpr e s v1 -> EvalExpr e s v2 -> v1 = v2 := by
  intro e s v1 v2 hEval1 hEval2
  have h1 : v1 = evalExpr e s := evalExpr_sound hEval1
  have h2 : v2 = evalExpr e s := evalExpr_sound hEval2
  exact Eq.trans h1 h2.symm

/--
  Statements of the selected Hash subset.
  These are included to complete the operational-semantics model.
-/
inductive Stmt where
  | assign : Var -> Expr -> Stmt
  | seq    : Stmt -> Stmt -> Stmt
  | ifElse : Expr -> Stmt -> Stmt -> Stmt
  | while  : Expr -> Stmt -> Stmt
  deriving Repr

/--
  Updating a state after an assignment.
  `update s x v` is a new state where x maps to v,
  and every other variable keeps its old value from s.
-/
def update (s : State) (x : Var) (v : Int) : State :=
  fun y => if y == x then v else s y

/--
  Big-step operational semantics for statements.
  `BigStep S s s'` means:
  statement `S` starts in state `s` and finishes in state `s'`.
-/
inductive BigStep : Stmt -> State -> State -> Prop where
  | assign : forall (x : Var) (e : Expr) (s : State) (v : Int),
      EvalExpr e s v ->
      BigStep (Stmt.assign x e) s (update s x v)

  | seq : forall (S1 S2 : Stmt) (s smid sout : State),
      BigStep S1 s smid ->
      BigStep S2 smid sout ->
      BigStep (Stmt.seq S1 S2) s sout

  | ifTrue : forall (b : Expr) (S1 S2 : Stmt) (s sout : State) (v : Int),
      EvalExpr b s v ->
      v ≠ 0 ->
      BigStep S1 s sout ->
      BigStep (Stmt.ifElse b S1 S2) s sout

  | ifFalse : forall (b : Expr) (S1 S2 : Stmt) (s sout : State),
      EvalExpr b s 0 ->
      BigStep S2 s sout ->
      BigStep (Stmt.ifElse b S1 S2) s sout

  | whileFalse : forall (b : Expr) (S : Stmt) (s : State),
      EvalExpr b s 0 ->
      BigStep (Stmt.while b S) s s

  | whileTrue : forall (b : Expr) (S : Stmt) (s smid sout : State) (v : Int),
      EvalExpr b s v ->
      v ≠ 0 ->
      BigStep S s smid ->
      BigStep (Stmt.while b S) smid sout ->
      BigStep (Stmt.while b S) s sout

/--
  The Hash `baraye(init; cond; update) { body }` loop can be treated
  as syntactic sugar for:
  init; while(cond) { body; update }
-/
def forLoop (init : Stmt) (cond : Expr) (step : Stmt) (body : Stmt) : Stmt :=
  Stmt.seq init (Stmt.while cond (Stmt.seq body step))

end ExpressionDeterminismProof
