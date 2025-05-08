public class ForNode extends ASTNode {
    private final String varName;
    private final ASTNode startExpr;
    private final ASTNode endExpr;
    private final BlockNode body;

    public ForNode(String varName, ASTNode startExpr, ASTNode endExpr, BlockNode body) {
        this.varName = varName;
        this.startExpr = startExpr;
        this.endExpr = endExpr;
        this.body = body;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String startVal = startExpr.generateLLVM(builder);
        String endVal = endExpr.generateLLVM(builder);

        String loopVar = builder.createVariable(varName);
        builder.emit(loopVar + " = " + startVal);

        String loopCondLabel = builder.createLabel("for_cond");
        String loopBodyLabel = builder.createLabel("for_body");
        String loopEndLabel = builder.createLabel("for_end");

        // Jump to condition check
        builder.emit("br label %" + loopCondLabel);

        // Condition check
        builder.emit(loopCondLabel + ":");
        String currentVal = builder.getVariable(varName);
        String cmp = builder.createTemp();
        builder.emit(cmp + " = icmp sle i32 " + currentVal + ", " + endVal);
        builder.emit("br i1 " + cmp + ", label %" + loopBodyLabel + ", label %" + loopEndLabel);

        // Loop body
        builder.emit(loopBodyLabel + ":");
        builder.emit(body.generateLLVM(builder));
        String incremented = builder.createTemp();
        builder.emit(incremented + " = add i32 " + currentVal + ", 1");
        builder.setVariable(varName, incremented);
        builder.emit("br label %" + loopCondLabel);

        // Loop end
        builder.emit(loopEndLabel + ":");

        return "";
    }
}
