import java.util.*;

public class IRBuilder {
    private List<String> instructions = new ArrayList<>();
    private int tempCount = 0;
    private int labelCount = 0;
    private Map<String, String> variables = new HashMap<>();

    public String createTemp() {
        return "%t" + (tempCount++);
    }

    public String createLabel(String base) {
        return base + "_" + (labelCount++);
    }

    public void emit(String instruction) {
        instructions.add(instruction);
    }

    public String getIR() {
        return String.join("\n", instructions);
    }

    public String createVariable(String varName) {
        String llvmName = "%" + varName;
        variables.put(varName, llvmName);
        return llvmName;
    }

    public void setVariable(String varName, String tempName) {
        variables.put(varName, tempName);
    }

    public String getVariable(String varName) {
        return variables.getOrDefault(varName, "%" + varName);
    }
}
