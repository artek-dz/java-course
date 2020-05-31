package assign11;

import java.util.Objects;

public final class FeatureName {
    private final String name;

    private FeatureName(String name) {
        this.name = name;
    }

    public static FeatureName with(String name) {
        return new FeatureName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeatureName that = (FeatureName) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
}
