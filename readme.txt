# Final_Project_LLVM_IR_Generator
## TEAM_69
## Vinay_Mehta_55160069
## Lakshmi_Venkata_Sai_Charan_Nuthalapati_55029265

## Project Overview
This project implements a compiler for a subset of the Julia programming language using **ANTLR4** and **Java**,
targeting LLVM Intermediate Representation (IR). It supports essential programming constructs like arithmetic operations,
variable assignments, conditionals, loops, and user-defined functions. The generated LLVM IR can be compiled and executed
using tools from the LLVM toolchain. The compiler builds a custom Abstract Syntax Tree (AST) and translates it into valid
LLVM IR code.

---

## Features Implemented

- Arithmetic expressions (`+`, `-`, `*`, `/`)
- Variable declarations and assignments
- Print statements (`print(expr)`)
- If-then blocks
- While loops
- For-do loops
- Return statements
- User-defined functions with parameters and return values
- Nested function calls
- Function call chaining and block scoping
- AST to LLVM IR generation

---

## Files and Structure

| File / Folder               | Description                                        |
|----------------------------|----------------------------------------------------|
| `Main.java`                | Entry point of the compiler                        |
| `JuliaSubset.g4`           | ANTLR grammar file defining the Julia subset       |
| `ASTBuilderVisitor.java`   | Builds a custom AST from ANTLR parse tree          |
| `ASTNode.java`             | Base class for all AST nodes                       |
| `LLVMCodeGenerator.java`   | Converts AST into LLVM IR                          |
| `*.java`                   | Other AST node classes (e.g., `FuncDeclNode`, `IfNode`) |
| `test1.julia` to `test9.julia` | Sample input test files                        |
| `output.ll` or `testX.ll`  | Generated LLVM IR files                            |

---

## Requirements
- Java JDK 17 or later
- ANTLR4 Tool (included as a JAR)

## Setup Instructions

### 1. Compile the Grammar
```
java -jar antlr-4.13.1-complete.jar -visitor JuliaSubset.g4
```

### 2. Compile the Java Files
```
javac -cp ".;antlr-4.13.1-complete.jar" *.java
```

### 3. Run Any Test File
```
java -cp ".;antlr-4.13.1-complete.jar" Main test1.julia
```
Replace `test1.julia` with any `.julia` test file.


## Test Case Overview

| Test Case  | Description                                      | Expected Behavior / Output |
|------------|--------------------------------------------------|-----------------------------|
| `test1.julia` | Basic arithmetic and print                    | Prints `50`                |
| `test2.julia` | Function definition and return                | Prints result of `add(3, 4)` = `7` |
| `test3.julia` | While loop with print inside loop             | Prints `0` to `4` line by line |
| `test4.julia` | Simple `if` condition check                   | Prints `7` if condition passes |
| `test5.julia` | Function with intermediate temp vars          | Prints `2 * 3 + 10 = 16`    |
| `test6.julia` | Multiple function calls with nesting          | Computes and prints `2 + (3 * 4) = 14` |
| `test7.julia` | For loop sum (was unimplemented, now working) | Prints sum `1 + 2 + 3 + 4 + 5 = 15` |
| `test8.julia` | Comparison-based conditional printing         | Prints `10` if `x < y`     |
| `test9.julia` | Function chaining: cube using square call     | Prints `3^3 = 27`          |

-> Each `.julia` test case is automatically compiled into a corresponding `.ll` file and prints output using LLVM's `printf`.

## Demo_Video_Link
"https://youtu.be/4AWSZKXhT8w"
