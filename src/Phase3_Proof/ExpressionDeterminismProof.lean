namespace ExpressionDeterminism

abbrev Var := String

abbrev State := Var -> Int

/--
  Expressions in the selected, total subset of Hash.

  Comparison results are represented as integers:
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



inductive EvalExpr : Expr -> State -> Int -> Prop where

  /-- A numeric literal evaluates to itself. -/
  | num : forall (n : Int) (s : State),
      EvalExpr (Expr.num n) s n

  /-- A variable evaluates to the value stored in the current state. -/
  | var : forall (x : Var) (s : State),
      EvalExpr (Expr.var x) s (s x)

  /-- Addition evaluates both operands and adds their results. -/
  | add : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.add e1 e2) s (v1 + v2)

  /-- Multiplication evaluates both operands and multiplies their results. -/
  | mul : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.mul e1 e2) s (v1 * v2)

  /-- Less-than evaluates to 1 when true and 0 when false. -/
  | lt : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.lt e1 e2) s
        (if v1 < v2 then 1 else 0)

  /-- Equality evaluates to 1 when true and 0 when false. -/
  | eq : forall (e1 e2 : Expr) (s : State) (v1 v2 : Int),
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.eq e1 e2) s
        (if v1 = v2 then 1 else 0)


/--
  Expression evaluation is deterministic.

  If the same expression is evaluated in the same state
  by two derivations, both derivations produce the same value.
-/
theorem expression_determinism :
    forall {e : Expr} {s : State} {v1 v2 : Int},
      EvalExpr e s v1 ->
      EvalExpr e s v2 ->
      v1 = v2 := by

  intro e s v1 v2 hFirst

  induction hFirst generalizing v2 with

  | num n s =>
      intro hSecond
      cases hSecond
      rfl

  | var x s =>
      intro hSecond
      cases hSecond
      rfl

  | add e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | add _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1'
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb]

  | mul e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | mul _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1'
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb]

  | lt e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | lt _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1'
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb]

  | eq e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | eq _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1'
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb]

end ExpressionDeterminism