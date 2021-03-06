package assign11;

import java.util.Objects;

public class Feature {
    private FeatureName name;
    private FeatureValue value;

    private Feature(FeatureName name, FeatureValue value) {
        this.name = name;
        this.value = value;
    }

    public static Feature with(String name, FeatureValue value) {
        return new Feature(FeatureName.with(name), value);
    }

    public static Feature with(String name, String value) {
        return new Feature(FeatureName.with(name), AtomicValue.with(value));
    }

    public FeatureName getName() {
        return name;
    }

    public FeatureValue getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature feature = (Feature) o;
        return Objects.equals(name, feature.name) &&
                Objects.equals(value, feature.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "[" + name + " : " + value + "]";
    }

}
