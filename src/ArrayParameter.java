import java.util.ArrayList;
import java.util.List;

public class ArrayParameter extends Parameter {
    List<Parameter> parameters;
    final String reference;
    final ParameterDefinition parameterDefinition;
    public ArrayParameter(String name, String reference, ParameterDefinition parameterDefinition, DataField parent){
        super(name, parent);
        this.reference = reference;
        this.parameterDefinition = parameterDefinition;
        this.parameters = new ArrayList<>();
    }
    public void setLength(int newValue){
        List<Parameter> newList = new ArrayList<>(newValue);
        parameters.stream().limit(newValue).forEach(newList::add);
        while(newList.size() <= newValue) newList.add(parameterDefinition.initialize(parent));
        parameters = newList;
    }
    @Override
    public List<Parameter> getAllParameter() {
        return parameters;
    }
}
