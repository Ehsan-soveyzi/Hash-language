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
  | Expr.add e1 e2 => evalExpr e1 s + evalExpr e2 s -- this is recursion
  | Expr.lt e1 e2 =>
      if evalExpr e1 s < evalExpr e2 s then 1 else 0

def update (s : State) (x : Var) (v : Int) : State := -- here the type of y is var because we knew that the output must be state , so as we said before the state := var -> Int , so the update get's {y : var} for updating the current state
  fun y => if y == x then v else s y

inductive BigStep : Stmt -> State -> State -> Prop where
  | assign (x : Var) (e : Expr) (s : State) :
      BigStep
        (Stmt.assign x e) -- this is the main statement that we note in the definition of BigStep
        s -- this is the pervious state
        (update s x (evalExpr e s)) -- this is the next state known as s'(updated in some Var in the consider state and outdate for other depends that var are updated in pervious assignment state or not)

  | seq (S1 : Stmt) (S2 : Stmt) (s : State) (smid : State) (sout : State) :
      BigStep S1 s smid -> -- updated state for first Statement
      BigStep S2 smid sout ->  -- updated state for the second Statement
      BigStep (Stmt.seq S1 S2) s sout -- this step known as final step that define the whole BigStep institution

  | ifTrue (b : Expr) (S1 : Stmt) (S2 : Stmt) (s : State) (sout : State) :
      evalExpr b s ≠ 0 -> -- if the condition was validate duo to how we define the lt in evalExpr
      BigStep S1 s sout -> -- if the condition is provided , process the ifTrue(S1) body Stmt
      BigStep (Stmt.ifElse b S1 S2) s sout -- so whole structure is if b then S1 else S2 , and from state s get updated to sout

  | ifFalse : forall b S1 S2 s sout,
      evalExpr b s = 0 -> -- if the condition is not provided
      BigStep S2 s sout -> -- means process the else body and go from state s to sout(updated state)
      BigStep (Stmt.ifElse b S1 S2) s sout

  | whileF (b : Expr) (S : Stmt) (s : State) :
      evalExpr b s = 0 ->
      BigStep (Stmt.while b S) s s -- here because the loop condition is not provided , so there is no transformation in logics so no change in states

  | whileT (b : Expr) (S : Stmt) (s : State) (smid : State) (sout : State) :
      evalExpr b s ≠ 0 ->
      BigStep S s smid ->
      BigStep (Stmt.while b S) smid sout -> -- this line and previous line defined the iteration logic of our loop
      BigStep (Stmt.while b S) s sout

theorem determinism :
    forall
      {program : Stmt}
      {startState : State}
      {finalState1 : State}
      {finalState2 : State},
      BigStep program startState finalState1 ->
      BigStep program startState finalState2 ->
      finalState1 = finalState2 := by

  intro program startState finalState1 finalState2 firstRun

  induction firstRun generalizing finalState2 with

  | assign x e s =>
      intro secondRun
      cases secondRun with
      | assign x2 e2 s2 =>
          rfl

  | seq S1 S2 s sMid1 sOut1 firstPartRun1 secondPartRun1 ihFirstPart ihSecondPart =>
      intro secondRun
      cases secondRun with
      | seq S1' S2' s' sMid2 sOut2 firstPartRun2 secondPartRun2 =>
          have sameMiddleState : sMid1 = sMid2 :=
            ihFirstPart firstPartRun2
          cases sameMiddleState
          exact ihSecondPart secondPartRun2

  | ifTrue b S1 S2 s sOut1 conditionIsTrue thenRun1 ihThen =>
      intro secondRun
      cases secondRun with
      | ifTrue b' S1' S2' s' sOut2 conditionIsTrue2 thenRun2 =>
          exact ihThen thenRun2
      | ifFalse b' S1' S2' s' sOut2 conditionIsFalse elseRun2 =>
          exact False.elim (conditionIsTrue conditionIsFalse)

  | ifFalse b S1 S2 s sOut1 conditionIsFalse elseRun1 ihElse =>
      intro secondRun
      cases secondRun with
      | ifTrue b' S1' S2' s' sOut2 conditionIsTrue thenRun2 =>
          exact False.elim (conditionIsTrue conditionIsFalse)
      | ifFalse b' S1' S2' s' sOut2 conditionIsFalse2 elseRun2 =>
          exact ihElse elseRun2

  | whileF b S s conditionIsFalse =>
      intro secondRun
      cases secondRun with
      | whileF b' S' s' conditionIsFalse2 =>
          rfl
      | whileT b' S' s' sMid2 sOut2 conditionIsTrue bodyRun loopRun =>
          exact False.elim (conditionIsTrue conditionIsFalse)

  | whileT b S s sMid1 sOut1 conditionIsTrue bodyRun1 loopRun1 ihBody ihLoop =>
      intro secondRun
      cases secondRun with
      | whileF b' S' s' conditionIsFalse =>
          exact False.elim (conditionIsTrue conditionIsFalse)
      | whileT b' S' s' sMid2 sOut2 conditionIsTrue2 bodyRun2 loopRun2 =>
          have sameMiddleState : sMid1 = sMid2 :=
            ihBody bodyRun2
          cases sameMiddleState
          exact ihLoop loopRun2

end DeterminismProof