import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap<>(properties);
        }
    }

    public Object getProperty(String name) {
        return properties.get(name);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (getClass() != other.getClass()) return false;

        InstrumentSpec otherSpec = (InstrumentSpec) other;

        for (var key: otherSpec.properties.keySet()) {
            if (!Objects.equals(properties.get(key), otherSpec.properties.get(key))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return properties.hashCode();
    }

    @Override
    public String toString() {
        return getClass().getName() + "[properties=" + properties.toString() + "]";
    }
}
