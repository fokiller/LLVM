public class ReturnNode extends ASTNode {
    private ASTNode value;

    public ReturnNode(ASTNode value) {
        this.value = value;
    }

    public ASTNode getValue() {
        return value;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        // Generate code for the return expression (e.g., x + y)
        String val = value.generateLLVM(builder);

        // Emit the return instruction
        builder.emit("ret i32 " + val);

        // Nothing to return as it's the final instruction
        return "";
    }
}
