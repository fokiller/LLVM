import java.util.List;

public class FunctionCallNode extends ASTNode {
    private String functionName;
    private List<ASTNode> args;

    public FunctionCallNode(String functionName, List<ASTNode> args) {
        this.functionName = functionName;
        this.args = args;
    }

    @Override
    public String generateLLVM(IRBuilder builder) {
        StringBuilder argBuilder = new StringBuilder();
        for (int i = 0; i < args.size(); i++) {
            if (i > 0)
                argBuilder.append(", ");
            argBuilder.append("i32 ").append(args.get(i).generateLLVM(builder));
        }
        String temp = builder.createTemp();
        builder.emit(temp + " = call i32 @" + functionName + "(" + argBuilder + ")");
        return temp;
    }
}
