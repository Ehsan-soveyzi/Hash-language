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

  intro e s v1 v2 hFirst -- hFirst : EvalExpr e s v1

  induction hFirst generalizing v2 with -- here we first use induction on the first deriviation
    -- here we will check that hFirst(that consider EvalExpr) is created by which expression,use different cases
  | num n s =>
      intro hSecond -- here we enter the second deriviation
      cases hSecond -- here we will check that the second deriviation is created by which expression
      rfl -- because if the first deriviation is number , the second deriviation can be only num , so there is
     -- only one way , v2 = n as well , we conclude with rfl(every things is equal by itself)

  | var x s =>
      intro hSecond -- hSecond :  EvalExpr (Expr.num n) s v2
      cases hSecond -- same as what happen in num , the first deriviation and the second one have same result
      rfl -- here v2 = s x , so we knew that v1 = s x as well , so we conclude using rfl

  | add e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
        /--
        e1 -> left expression , e2 -> right expression , s -> state , a1 -> result of e1
        a2 -> result of e2 , h1 -> left deriviation , h2 -> right derivation
        ih1 -> left determinism , ih2 -> second determinism
        hFirst -> EvalExpr (e1+e2) s v1
        hSecond -> EvalExpr (e1+e2) s v2
        in the first derivation : e1 -> a1 , e2 -> a2 --> e1 + e2 -> a1 + a2
        in the second derivation : e1 -> b1 , e2 -> b2 --> e1 + e2 -> b1 + b2
        -/
      intro hSecond
      cases hSecond with
      | add _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1' -- here with ih1 we conclude base on what we knew that e1 -> a1 ,e1 -> b1 , so a1 = b1
          have hb : a2 = b2 := ih2 h2'-- same above except that we use second induction hypothesis
          rw [ha, hb] -- after two line above this line prove that b1+b2 = a1+a2 -> then rewriting process conclude b1+b2=b1+b2 ,and this prove with rfl

  | mul e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | mul _ _ _ b1 b2 h1' h2' => -- this signs means with same expressions and state
          have ha : a1 = b1 := ih1 h1'
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb] -- same in add this conclude a1*a2 = b1*b2

  | lt e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | lt _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1' -- e1 -> a1,b1 , e2 -> a2,b2 then a1=b1,a2=b2
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb] -- a1 < a2 & b1 < b2

  | eq e1 e2 s a1 a2 h1 h2 ih1 ih2 =>
      intro hSecond
      cases hSecond with
      | eq _ _ _ b1 b2 h1' h2' =>
          have ha : a1 = b1 := ih1 h1'
          have hb : a2 = b2 := ih2 h2'
          rw [ha, hb]

end ExpressionDeterminism