public class ParameterDefinition {
    String arrayReference;
    String name;

    public ParameterDefinition(String name) {
        this.name = name;
    }

    public ParameterDefinition(String name, String arrayReference) {
        this.name = name;
        this.arrayReference = arrayReference;
    }

    public Parameter initialize(DataField parent) {
        if (arrayReference != null) {
            return new ArrayParameter(name, arrayReference, new ParameterDefinition(name), parent);
        }
        return new Parameter(name, parent);
    }
}
