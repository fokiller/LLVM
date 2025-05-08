import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide a .julia file as an argument.");
            return;
        }

        String inputFile = args[0];
        System.out.println("Running file: " + inputFile);

        // Read the input Julia file
        CharStream input = CharStreams.fromFileName(inputFile);
        JuliaSubsetLexer lexer = new JuliaSubsetLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JuliaSubsetParser parser = new JuliaSubsetParser(tokens);

        // Parse tree
        ParseTree tree = parser.program();

        // Build AST from Parse Tree
        ASTBuilderVisitor astBuilder = new ASTBuilderVisitor();
        ASTNode ast = astBuilder.visit(tree);

        // Generate LLVM IR
        LLVMCodeGenerator llvmGen = new LLVMCodeGenerator();
        String llvmIR = llvmGen.generate(ast);

        // Output LLVM IR
        System.out.println("\n--- Generated LLVM IR ---\n");
        System.out.println(llvmIR);

        // Generate output filename from input
        String outputFile = inputFile.replaceAll("\\.julia$", ".ll");
        llvmGen.saveToFile(outputFile, ast);
        System.out.println("LLVM IR saved to: " + outputFile);

        // Simulate result (e.g., print variable c if it exists in AST)
        if (ast instanceof BlockNode block) {
            for (ASTNode stmt : block.getStatements()) {
                if (stmt instanceof AssignmentNode assign && assign.getVarName().equals("c")) {
                    String llvmResult = assign.getExpression().generateLLVM(new IRBuilder());
                    System.out.println("Simulated Output (c): " + llvmResult); // or evaluate expression manually
                }
            }
        }

    }
}
