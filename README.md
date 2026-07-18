# Hash Programming Language

**Hash** is a small educational programming language designed as a course project for **Language and Automata Theory / Compiler Design**.  
The project focuses on building a complete grammar using **ANTLR v4** and adding a semantic checking layer in **Java**.

**Author:** Ehsan Soveizi & Mahdi Rashidi

---

## Project Overview

Hash is a Persian-inspired programming language with custom keywords.  
The language supports basic programming constructs such as variables, expressions, conditionals, loops, functions, classes, object instantiation, input/output, switch-case, and exception handling.

The goal of the project is not to build a full interpreter or compiler backend, but to demonstrate:

- lexical and syntactic design using ANTLR grammar rules,
- parse tree generation,
- semantic validation using a listener-based Java checker,
- meaningful test cases that cover the main language features.

---

## Main Technologies

- **Java**
- **ANTLR v4**
- **IntelliJ IDEA**
- **ANTLR Listener API**
- **Parse Tree Visualization**

---

## Language Keywords

| Hash Keyword | Meaning |
|---|---|
| `baste` | module/package declaration |
| `biar` | import |
| `adad` | integer |
| `ashari` | float |
| `boole` | boolean |
| `matn` | string |
| `harf` | char |
| `hich` | void |
| `dorost` | true |
| `ghalat` | false |
| `khali` | null |
| `age` | if |
| `bood` | condition marker |
| `vagarna` | else |
| `ta` | while |
| `baraye` | for |
| `shekan` | break |
| `edame` | continue |
| `bebin` | define function/method/constructor |
| `bede` | return |
| `klass` | class |
| `jadid` | new |
| `in` | this |
| `bechap` | print |
| `bekhan` | input |
| `entekhab` | switch |
| `halat` | case |
| `digar` | default |
| `emtehan` | try |
| `gereftar` | catch |
| `akhar` | finally |
| `bendaz` | throw |

---

## Supported Language Features

### 1. Module and Import

```hash
baste demo.main;

biar system.io.*;
biar hash.tools.*;
```

The grammar allows one optional module declaration followed by zero or more imports at the beginning of the file.

---

### 2. Variables and Primitive Types

Hash supports variable declaration with and without initial assignment.

```hash
adad x = 10;
ashari y = 2.5;
boole ok = dorost;
matn name = "Ali";
harf c = 'A';

adad counter;
counter = 5;
```

Supported primitive types:

- `adad`
- `ashari`
- `boole`
- `matn`
- `harf`

The semantic checker validates assignment type compatibility.

---

### 3. Expressions and Operator Precedence

Hash supports layered expression parsing based on operator priority.

Supported operators include:

```text
()
.
! ++ -- + -
**
* / %
+ -
> >= < <=
== !=
&&
||
= += -= *= /=
```

The expression grammar supports:

- parentheses,
- function calls,
- method calls,
- field access,
- prefix operators,
- postfix operators,
- power operator with right associativity,
- arithmetic operations,
- comparison,
- equality,
- logical AND / OR.

Example:

```hash
adad x = (2 + 3) * -3 ** 4 ** 5;
boole ok = !dorost || (ghalat && (1 > 2));
matn message = "value is: " + x;
```

---

### 4. Input and Output

```hash
bekhan(adad n, matn name);

bechap("Hello " + name);
bechap(n);
```

The semantic checker adds input variables to the main variable table so they can be used later.

---

### 5. Conditional Statements

```hash
age (n > 2) bood {
    bechap("greater than two");
} vagarna {
    bechap("small number");
}
```

The semantic checker validates that the condition expression has type `boole`.

---

### 6. Loops, Break, and Continue

Hash supports both `while` and `for` loops.

```hash
adad total = 0;
adad outer = 0;

ta (outer < 3) {
    baraye (adad i = 0; i < 10; i = i + 1) {
        age (i == 2) bood {
            edame;
        }

        age (i == 7) bood {
            shekan;
        }

        total = total + i;
    }

    outer = outer + 1;
}
```

The semantic checker ensures that `shekan` and `edame` are only used inside loops.

---

### 7. Switch-Case

```hash
harf myChar = 'A';

entekhab(myChar) {
    halat 'A' {
        bechap('A');
    }

    halat 'B' {
        bechap('B');
    }

    digar {
        bechap("no result");
    }
}
```

The semantic checker checks that case values are compatible with the switch variable type.

---

### 8. Functions and Recursion

```hash
bebin adad fibo(adad n) {
    age (n == 1 || n == 0) bood {
        bede n;
    }

    bede fibo(n - 1) + fibo(n - 2);
}

adad result = fibo(3);
```

Supported function features:

- typed parameters,
- typed return values,
- `hich` functions,
- recursive function calls,
- function calls before or after declaration,
- return type validation,
- argument count and argument type checking.

---

### 9. Classes, Constructors, Fields, and Methods

```hash
klass Hesab {
    adad x;
    adad y;

    bebin Hesab(adad start, adad second) {
        in.x = start;
        in.y = second;
    }

    bebin adad zarb(adad a, adad b) {
        bede a * b;
    }

    bebin adad jamFields() {
        bede in.x + in.y;
    }

    bebin hich setX(adad newValue) {
        in.x = newValue;
    }
}

Hesab h = jadid Hesab(5, 2);

adad result1 = h.zarb(3, 4);
adad result2 = h.jamFields();

h.x = 20;
h.setX(30);
```

The semantic checker validates:

- class existence,
- constructor name,
- constructor arguments,
- field existence,
- field assignment type,
- method existence,
- method argument types,
- method return type,
- correct use of `in`.

---

### 10. Exception Handling

Hash supports a try-catch-finally style structure.

```hash
klass MyError;

emtehan {
    bechap("inside try block");
    bendaz SefrBood();
}
gereftar (SefrBood e) {
    bechap("zero exception handled");
}
akhar {
    bechap("finally block executed");
}

emtehan {
    bendaz MyError();
}
gereftar (MyError err) {
    bechap("custom exception handled");
}
akhar {
    bechap("custom finally done");
}
```

Predefined exception types:

- `SefrBood`
- `MahdoodeNadorost`
- `JadvalKhali`
- `GheireMojaz`

The semantic checker validates exception type names and catch variable scope.

---

## Semantic Checker

The semantic checker is implemented in Java using the ANTLR Listener API.

It checks important semantic rules such as:

- variables must be defined before use,
- assignment type compatibility,
- function return type correctness,
- function argument count and type,
- recursive and forward function calls,
- loop-only usage of `shekan` and `edame`,
- boolean conditions for `age`, `ta`, and `baraye`,
- class and object validation,
- constructor validation,
- method and field access validation,
- exception type validation,
- catch variable scoping.

Example semantic error:

```text
Semantic Error line 12: Cannot assign value of type matn to variable 'x' of type adad
```
# Formal Verification

## Next level Project Overview

The main workflow is:

```text
Hash source code
      |
      v
ANTLR lexer/parser ---> Java semantic checker
      |
      v
Hash-to-Promela translator ---> SPIN + LTL model checking

Operational semantics of a Hash subset ---> Lean 4 proofs
```

The project does not implement a complete interpreter or compiler backend. Its purpose is to demonstrate how a programming language can be parsed, semantically checked, translated into a verification model, and studied through machine-checked proofs.


### 2. Phase 1 — Hash to Promela Translation

`PromelaTranslator.java` translates the verification subset of Hash into **Promela**. This subset focuses on:

- `adad` and `boole` variables;
- assignments and supported expressions;
- conditionals and nested loops;
- `shekan` and `edame`;
- basic `emtehan / gereftar / bendaz` behavior.

Important translation decisions include:

- Hash loops are converted to Promela `do ... od` structures;
- `edame` is implemented with generated labels and `goto`;
- exceptions are modeled with Boolean error flags and control-flow labels;
- division operations are instrumented to detect division by zero;
- the `**` operator is expanded into helper variables and multiplication loops;
- loop-entry, loop-exit, and program-end markers are generated for verification.

`PromelaMain.java` reads a Hash file and produces:

- `src/output/output.pml`
- `src/output/properties.ltl`

### 3. Phase 2 — Model Checking with SPIN

The generated Promela model is checked with **SPIN** using LTL properties. The project covers:

| Property | Purpose |
|---|---|
| Safety | Division by zero must never occur. |
| Liveness | Entering a loop must eventually lead to its exit. |
| Reachability | The final program state must be reachable. |
| Invariant | Selected integer variables must remain non-negative. |
| Deadlock freedom | The model must not become permanently blocked. |

Liveness properties are generated separately for each loop using the labels inserted during translation. Detailed commands, terminal outputs, examples, and result interpretations are available in `src/Reports/phase2_model_checker_documentation.pdf`.

### 4. Phase 3 — Formal Proofs in Lean 4

A compact subset of Hash is given an operational semantics using expressions, statements, states, state updates, and big-step execution relations.

The repository contains the following Lean developments:

- `DeterminismProof.lean` — determinism of statement execution;
- `ExpressionDeterminismProof.lean` — uniqueness of expression-evaluation results;
- `LoopInvariant.lean` — preservation of an invariant across every terminating loop execution;
- `StateEquivalence.lean` — execution from states that agree on the relevant free variables produces final states that still agree on those variables.

The State Equivalence theorem intentionally concludes agreement only over the free variables of the statement, rather than equality of the entire final states. This is the corrected and generally provable formulation.

## Repository Structure

```text
src/
├── Hash.g4
├── gen/                         # Generated ANTLR sources
├── SemanticCheckerMain.java
├── SemanticChecker_SourceCode/
├── PromelaMain.java
├── Phase1_Promela/
│   └── PromelaTranslator.java
├── output/
│   ├── output.pml
│   └── properties.ltl
├── Phase3_Proof/                # Lean 4 proofs
├── Reports/                     # Detailed project reports
└── tester.txt                   # Sample Hash input
```

## Requirements

- Java and `javac`
- ANTLR 4.13.2
- SPIN 6.x
- Lean 4

## Basic Usage

Generate or refresh the ANTLR sources from inside `src/`:

```bash
java -jar ../antlr-4.13.2-complete.jar -Dlanguage=Java -visitor -listener -package gen -o gen Hash.g4
```

After compiling the Java sources, run the semantic checker:

```bash
java -cp "out;antlr-4.13.2-complete.jar" SemanticCheckerMain
```

Generate the Promela model from a Hash program:

```bash
java -cp "out;antlr-4.13.2-complete.jar" PromelaMain src/tester.txt src/output/output.pml
```

On Linux or macOS, replace `;` in the classpath with `:`.

To verify a named LTL property, merge the generated model and property file, then run SPIN. For example:

```bash
cat src/output/output.pml src/output/properties.ltl > src/output/model.pml
spin -search -ltl safety src/output/model.pml
```

Each Lean file can be checked independently:

```bash
lean src/Phase3_Proof/StateEquivalence.lean
```

## Scope

The full ANTLR grammar is broader than the Promela translation subset. The project focuses on parsing, semantic analysis, model generation, model checking, and formal reasoning; it does not currently execute Hash programs or generate machine code.

