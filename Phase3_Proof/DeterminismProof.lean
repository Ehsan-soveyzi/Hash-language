namespace DeterminismProof

abbrev Var := String
abbrev State := Var -> Int -- state_name Var_name -> int like (s x) this output is an Integer

-- these are the main expression that our hash model support include : "num" | "var" | "add" | "less than"
inductive Expr where
  | num : Int -> Expr -- e.g -> Expr.num 5
  | var : Var -> Expr -- e.g -> Expr.var "x"   the reason why we represent the x in "" is we define var equal to string at the first of this script
  | add : Expr -> Expr -> Expr -- e.g -> Expr.add (Expr.var "x") (Expr.num 3)  -> means (x + 3) there is no evaluation here , it just for schemas
  | lt  : Expr -> Expr -> Expr -- e.g -> Expr.lt (Expr.var "x") (Expr.num 10) -> means (x < 10)
  deriving Repr -- this notation means that lean can print their values using #eval in terminal since compiling

-- these are the main statements that our hash model accept , including : "assign" | "sequence of statements" | "ifElse statements" | "while statements"
inductive Stmt where -- there is no evaluation here , just schemas
  | assign : Var -> Expr -> Stmt -- e.g -> Stmt.assign "x" (Expr.add (Expr.var "y") (Expr.num 2)) -> means (x = y + 2)
  | seq    : Stmt -> Stmt -> Stmt -- e.g -> Stmt.seq S1 S2 means that these both statements operates in order S1;S2
  | ifElse : Expr -> Stmt -> Stmt -> Stmt -- e.g -> Stmt.ifElse b(as expression) S1 S2 means (if b then S1 else S2)
  | while  : Expr -> Stmt -> Stmt  -- e.g -> Stmt.while b(as loop condition) S means (while b do S)
  deriving Repr


def evalExpr (e : Expr) (s : State) : Int :=
  match e with
  | Expr.num n => n -- e.g -> evalExpr (Expr.num 5) s but here because e is number , state s is useless
  | Expr.var x => s x -- e.g -> s "x" = 10 after this assignment , read the value "x" -> evalExpr (Expr.var "x") s
  | Expr.add e1 e2 => evalExpr e1 s + evalExpr e2 s -- still e1 & e2 completely converted to Integer the recursion will continue
  | Expr.lt e1 e2 =>
      if evalExpr e1 s < evalExpr e2 s then 1 else 0

def update (s : State) (x : Var) (v : Int) : State := -- here the type of y is var because we knew that the output must be state , so as we said before the state := var -> Int , so the update get's {y : var} for updating the current state
  fun y => if y == x then v else s y

inductive BigStep : Stmt -> State -> State -> Prop where -- the output of BigStep is a logical Proposition that define what hash actually support
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

  | ifFalse
      (b : Expr)
      (S1 : Stmt)
      (S2 : Stmt)
      (s : State)
      (sout : State) :
      evalExpr b s = 0 -> -- if the condition was false
      BigStep S2 s sout ->
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

  intro program startState finalState1 finalState2 firstRun -- this line means these values will enter to our proof

  induction firstRun generalizing finalState2 with -- here lean ask if program runs for transforming start_state to final_state1 which commands contains in program

  | assign x e s =>
      intro secondRun -- entering second run
      cases secondRun with
      | assign x2 e2 s2 =>
          rfl -- means both firstRun and second run have same final state(s = s2)

  | seq S1 S2 s sMid1 sOut1 firstPartRun1 secondPartRun1 ihFirstPart ihSecondPart => -- ihFirstPart ihSecondPart these are induction hypothesis
      intro secondRun -- entering second run
      cases secondRun with
      | seq S1' S2' s' sMid2 sOut2 firstPartRun2 secondPartRun2 =>
          have sameMiddleState : sMid1 = sMid2 :=
            ihFirstPart firstPartRun2
          cases sameMiddleState
          exact ihSecondPart secondPartRun2 -- means with the same induction hypothesis prove that sOut1 = sOut2

  | ifTrue b S1 S2 s sOut1 conditionIsTrue thenRun1 ihThen => -- ihThen is induction hypothesis
      intro secondRun
      cases secondRun with
      | ifTrue b' S1' S2' s' sOut2 conditionIsTrue2 thenRun2 =>
          exact ihThen thenRun2
      | ifFalse b' S1' S2' s' sOut2 conditionIsFalse elseRun2 =>
          exact False.elim (conditionIsTrue conditionIsFalse) -- this is contradiction if the first ifstatement have true condition and the second have false

  | ifFalse b S1 S2 s sOut1 conditionIsFalse elseRun1 ihElse =>
      intro secondRun
      cases secondRun with
      | ifTrue b' S1' S2' s' sOut2 conditionIsTrue thenRun2 =>
          exact False.elim (conditionIsTrue conditionIsFalse) -- contradiction
      | ifFalse b' S1' S2' s' sOut2 conditionIsFalse2 elseRun2 =>
          exact ihElse elseRun2 -- with IH we conclude that elseRun2 & elseRun1 is same and have same final state

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