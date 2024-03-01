import java.util.ArrayList;
import java.util.List;

public class DataField  {
    List<Parameter> parameters;

    public DataField(List<ParameterDefinition> parameterDefinitions){
        parameters = new ArrayList<>();
        for(ParameterDefinition parameterDefinition : parameterDefinitions){
            parameters.add(parameterDefinition.initialize(this));
        }
    }
    public void parameterChanged(Parameter parameter1) {
        for(Parameter parameter : parameters){
            if(parameter instanceof ArrayParameter arrayParameter){
                if(arrayParameter.reference.equals(parameter1.name)){
                    arrayParameter.setLength(parameter1.value);
                }
            }
        }
    }

    public List<Parameter> getParameters() {
        List<Parameter> parameterList = new ArrayList<>();
        for(Parameter parameter : parameters){
            parameterList.addAll(parameter.getAllParameter());
        }
        return parameterList;
    }
}
