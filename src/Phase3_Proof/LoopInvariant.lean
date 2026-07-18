/-
  Phase 3 - Formal Proof in Lean 4
  Chosen theorem: Loop Invariant (Option 2)

  Authors: Ehsan Soveizi & Mahdi Rashidi

  Main claim:
    If predicate P holds before a while loop, and every complete
    execution of the loop body preserves P, then P also holds after
    every terminating execution of the whole loop.

  The proof is performed by structural recursion on the BigStep
  derivation of the while loop.
-/

namespace LoopInvariantProof

abbrev Var := String

abbrev State := Var -> Int

/--
    Comparison results are encoded as integers:
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
  `EvalExpr e s v` means that expression `e` evaluates to integer
  value `v` in state `s`.
-/
inductive EvalExpr : Expr -> State -> Int -> Prop where
  | num {n : Int} {s : State} :
      EvalExpr (Expr.num n) s n

  | var {x : Var} {s : State} :
      EvalExpr (Expr.var x) s (s x)

  | add {e1 e2 : Expr} {s : State} {v1 v2 : Int} :
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.add e1 e2) s (v1 + v2)

  | mul {e1 e2 : Expr} {s : State} {v1 v2 : Int} :
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.mul e1 e2) s (v1 * v2)

  | lt {e1 e2 : Expr} {s : State} {v1 v2 : Int} :
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.lt e1 e2) s
        (if v1 < v2 then 1 else 0)

  | eq {e1 e2 : Expr} {s : State} {v1 v2 : Int} :
      EvalExpr e1 s v1 ->
      EvalExpr e2 s v2 ->
      EvalExpr (Expr.eq e1 e2) s
        (if v1 = v2 then 1 else 0)

/-- Statements in the selected Hash subset. i will explains why i select this subset of hash statements -/
inductive Stmt where
  | assign : Var -> Expr -> Stmt
  | seq    : Stmt -> Stmt -> Stmt
  | ifElse : Expr -> Stmt -> Stmt -> Stmt
  | while  : Expr -> Stmt -> Stmt
  deriving Repr

def update (s : State) (x : Var) (v : Int) : State :=
  fun y => if y == x then v else s y

/--
  Relational big-step semantics for statements.

  `BigStep S sIn sOut` means that statement `S`, starting in state
  `sIn`, terminates in state `sOut`.
-/
inductive BigStep : Stmt -> State -> State -> Prop where
  /-- Assignment evaluates the expression and updates the variable. -/
  | assign {x : Var} {e : Expr} {s : State} {v : Int} :
      EvalExpr e s v ->
      BigStep (Stmt.assign x e) s (update s x v)

  /-- Sequence executes the first statement and then the second. -/
  | seq {S1 S2 : Stmt} {s smid sout : State} :
      BigStep S1 s smid ->
      BigStep S2 smid sout ->
      BigStep (Stmt.seq S1 S2) s sout

  /-- A nonzero condition executes the then-branch. -/
  | ifTrue {b : Expr} {S1 S2 : Stmt}
      {s sout : State} {v : Int} :
      EvalExpr b s v ->
      v ≠ 0 ->
      BigStep S1 s sout ->
      BigStep (Stmt.ifElse b S1 S2) s sout

  /-- A zero condition executes the else-branch. -/
  | ifFalse {b : Expr} {S1 S2 : Stmt} {s sout : State} :
      EvalExpr b s 0 ->
      BigStep S2 s sout ->
      BigStep (Stmt.ifElse b S1 S2) s sout

  /-- A zero loop condition stops immediately without changing state. -/
  | whileFalse {b : Expr} {body : Stmt} {s : State} :
      EvalExpr b s 0 ->
      BigStep (Stmt.while b body) s s

  /--
    A nonzero loop condition executes the body once and then executes
    the same loop again from the intermediate state.
  -/
  | whileTrue {b : Expr} {body : Stmt}
      {s smid sout : State} {v : Int} :
      EvalExpr b s v ->
      v ≠ 0 ->
      BigStep body s smid ->
      BigStep (Stmt.while b body) smid sout ->
      BigStep (Stmt.while b body) s sout

/--
  Loop Invariant theorem — Option 2 of Phase 3.

  `hInitial` says that P holds before the loop.

  `hPreserves` says that whenever the loop body starts in a state
  satisfying P, every terminating execution of the body also ends in
  a state satisfying P.

  `hLoop` is the complete big-step execution of the while loop.
-/
theorem loop_invariant
    {P : State -> Prop}
    {condition : Expr}
    {body : Stmt}
    {initial final : State}
    (hInitial : P initial)
    (hPreserves :
      forall {before after : State},
        P before ->
        BigStep body before after ->
        P after)
    (hLoop : BigStep (Stmt.while condition body) initial final) :
    P final := by

  have invariant_for_any_derivation :
      forall {command : Stmt} {start stop : State},
        BigStep command start stop ->
        forall {b : Expr} {loopBody : Stmt},
          command = Stmt.while b loopBody ->
          P start ->
          (forall {before after : State},
            P before ->
            BigStep loopBody before after ->
            P after) ->
          P stop := by

    intro command start stop h

    induction h with

    | assign hEval =>
        intro b loopBody hEq
        cases hEq

    | seq hFirst hSecond ihFirst ihSecond =>
        intro b loopBody hEq
        cases hEq

    | ifTrue hEval hNonzero hThen ihThen =>
        intro b loopBody hEq
        cases hEq

    | ifFalse hEval hElse ihElse =>
        intro b loopBody hEq
        cases hEq

    | whileFalse hCondition =>
        intro b loopBody hEq hStart hKeeps
        cases hEq
        exact hStart

    | whileTrue hCondition hNonzero hBody hRest ihBody ihRest =>
        intro b loopBody hEq hStart hKeeps
        cases hEq

        have hMiddle : P _ := hKeeps hStart hBody
        exact ihRest rfl hMiddle hKeeps

  exact invariant_for_any_derivation hLoop rfl hInitial hPreserves

end LoopInvariantProof
