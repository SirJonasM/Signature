
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParameterDefinition parameterDefinition1 = new ParameterDefinition("Par1");
        ParameterDefinition parameterDefinition2 = new ParameterDefinition("Par2");
        ParameterDefinition parameterDefinition3 = new ParameterDefinition("Par3","Par1");
        ParameterDefinition parameterDefinition4 = new ParameterDefinition("Par4", "Par2");
        DataField dataField = new DataField(List.of(parameterDefinition1,parameterDefinition2,parameterDefinition3,parameterDefinition4));
        dataField.getParameters().getFirst().setValue(2);
        dataField.getParameters().get(1).setValue(3);
        System.out.println(dataField.getParameters());
    }
}
