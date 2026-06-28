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

---

## Example Test Files

The project includes several test files demonstrating different parts of the language.

| Test File | Purpose |
|---|---|
| `test_one.txt` | assignments, expressions, operators, input/output |
| `test_two.txt` | functions, if/else, switch-case, recursion |
| `test_three.txt` | classes, constructors, methods, object instantiation |
| `test_four.txt` | exception handling |
| `test_five.txt` | loops, `shekan`, and `edame` |

Each test file can be parsed and checked using the Java driver program.

---

## Parse Tree Output

Parse trees were generated for the test files to show how the grammar recognizes different language structures.  
These parse tree images are useful for explaining:

- how the start rule expands,
- how statements are recognized,
- how expressions are grouped,
- how function and class bodies are parsed,
- how nested structures such as loops and conditionals appear in the parse tree.

---

## How to Run

### 1. Generate ANTLR Files

Run ANTLR on the grammar file:

```bash
java -jar antlr-4.13.2-complete.jar -visitor -listener Hash.g4
```

Or generate into a specific output folder:

```bash
java -jar antlr-4.13.2-complete.jar -visitor -listener -o gen Hash.g4
```

### 2. Compile Java Files

Make sure the ANTLR runtime is included in the classpath.

Example:

```bash
javac -cp ".;antlr4-runtime-4.13.2.jar" *.java
```

### 3. Run the Main Program

```bash
java -cp ".;antlr4-runtime-4.13.2.jar" Main
```

The program reads a Hash test file, builds the parse tree, and runs the semantic checker.

---

## Suggested Project Structure

```text
Hash_language_project/
│
├── src/
│   ├── Hash.g4
│   ├── Main.java
│   ├── SemanticChecker.java
│   ├── SaveParseTreeImage.java
│   ├── test_one.txt
│   ├── test_two.txt
│   ├── test_three.txt
│   ├── test_four.txt
│   └── test_five.txt
│
├── gen/
│   ├── HashLexer.java
│   ├── HashParser.java
│   ├── HashListener.java
│   └── HashBaseListener.java
│
├── parse_trees/
│   ├── Test_one_parse_tree.png
│   ├── Test_two_parse_tree.png
│   ├── Test_three_parse_tree.png
│   ├── Test_four_parse_tree.png
│   └── Test_five_parse_tree.png
│
└── README.md
```

---

## Known Limitations

This project focuses on grammar design and semantic checking, not interpretation or code generation.  
Therefore, the language currently does not execute programs or produce runtime values.

Some limitations:

- no full interpreter,
- no bytecode or machine code generation,
- limited block-level variable scoping,
- no function or method overloading,
- no inheritance,
- no real runtime exception propagation,
- no runtime behavior for prefix/postfix operators,
- switch currently works with identifiers,
- exception throwing is syntactically checked but not executed.

---

## Final Notes

Hash demonstrates how a custom programming language can be designed using ANTLR and Java.  
The project covers lexical rules, parser rules, operator precedence, structured statements, object-oriented constructs, exception handling, parse tree generation, and semantic validation.

The main purpose of this project is educational: to show how grammar design and semantic analysis work together in the front-end of a programming language.
# Hash Programming Language

**Hash** is a small educational programming language designed as a course project for **Language and Automata Theory / Compiler Design**.  
The project focuses on building a complete grammar using **ANTLR v4** and adding a semantic checking layer in **Java**.

**Author:** Ehsan Soveizi  
**Student ID:** 4032262112

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

---

## Example Test Files

The project includes several test files demonstrating different parts of the language.

| Test File | Purpose |
|---|---|
| `test_one.txt` | assignments, expressions, operators, input/output |
| `test_two.txt` | functions, if/else, switch-case, recursion |
| `test_three.txt` | classes, constructors, methods, object instantiation |
| `test_four.txt` | exception handling |
| `test_five.txt` | loops, `shekan`, and `edame` |

Each test file can be parsed and checked using the Java driver program.

---

## Parse Tree Output

Parse trees were generated for the test files to show how the grammar recognizes different language structures.  
These parse tree images are useful for explaining:

- how the start rule expands,
- how statements are recognized,
- how expressions are grouped,
- how function and class bodies are parsed,
- how nested structures such as loops and conditionals appear in the parse tree.

---

## How to Run

### 1. Generate ANTLR Files

Run ANTLR on the grammar file:

```bash
java -jar antlr-4.13.2-complete.jar -visitor -listener Hash.g4
```

Or generate into a specific output folder:

```bash
java -jar antlr-4.13.2-complete.jar -visitor -listener -o gen Hash.g4
```

### 2. Compile Java Files

Make sure the ANTLR runtime is included in the classpath.

Example:

```bash
javac -cp ".;antlr4-runtime-4.13.2.jar" *.java
```

### 3. Run the Main Program

```bash
java -cp ".;antlr4-runtime-4.13.2.jar" Main
```

The program reads a Hash test file, builds the parse tree, and runs the semantic checker.

---

## Suggested Project Structure

```text
Hash_language_project/
│
├── src/
│   ├── Hash.g4
│   ├── Main.java
│   ├── SemanticChecker.java
│   ├── SaveParseTreeImage.java
│   ├── test_one.txt
│   ├── test_two.txt
│   ├── test_three.txt
│   ├── test_four.txt
│   └── test_five.txt
│
├── gen/
│   ├── HashLexer.java
│   ├── HashParser.java
│   ├── HashListener.java
│   └── HashBaseListener.java
│
├── parse_trees/
│   ├── Test_one_parse_tree.png
│   ├── Test_two_parse_tree.png
│   ├── Test_three_parse_tree.png
│   ├── Test_four_parse_tree.png
│   └── Test_five_parse_tree.png
│
└── README.md
```

---

## Known Limitations

This project focuses on grammar design and semantic checking, not interpretation or code generation.  
Therefore, the language currently does not execute programs or produce runtime values.

Some limitations:

- no full interpreter,
- no bytecode or machine code generation,
- limited block-level variable scoping,
- no function or method overloading,
- no inheritance,
- no real runtime exception propagation,
- no runtime behavior for prefix/postfix operators,
- switch currently works with identifiers,
- exception throwing is syntactically checked but not executed.

---

## Final Notes

Hash demonstrates how a custom programming language can be designed using ANTLR and Java.  
The project covers lexical rules, parser rules, operator precedence, structured statements, object-oriented constructs, exception handling, parse tree generation, and semantic validation.

The main purpose of this project is educational: to show how grammar design and semantic analysis work together in the front-end of a programming language.
