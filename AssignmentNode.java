public class AssignmentNode extends ASTNode {
    private String varName;
    private ASTNode expression;

    public AssignmentNode(String varName, ASTNode expression) {
        this.varName = varName;
        this.expression = expression;
    }

    public String getVarName() {
        return varName;
    }

    public ASTNode getExpression() {
        return expression;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        String exprResult = expression.generateLLVM(builder);
        String var = builder.createVariable(varName);
        builder.emit(var + " = " + exprResult);
        return "";
    }
}
