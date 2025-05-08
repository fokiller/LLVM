@echo off
antlr4 JuliaSubset.g4
javac JuliaSubset*.java
javac -cp .;antlr-4.13.1-complete.jar JuliaInterpreter.java Main.java
java -cp .;antlr-4.13.1-complete.jar Main
