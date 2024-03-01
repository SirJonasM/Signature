import org.w3c.dom.xpath.XPathResult;

import java.util.Collection;
import java.util.List;

public class Parameter {
    public String name;
    DataField parent;
    int value;

    public Parameter(String name, DataField parent) {
        this.name = name;
        value = 0;
        this.parent = parent;
    }
    public void setValue(int value){
        this.value = value;
        parent.parameterChanged(this);
    }

    public List<Parameter> getAllParameter() {
        return List.of(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
