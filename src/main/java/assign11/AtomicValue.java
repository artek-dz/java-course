package assign11;

import java.util.Objects;

public class AtomicValue implements FeatureValue {
    private int coindex;
    private String value;

    private AtomicValue(int coindex, String value) {
        this.coindex = (coindex < 0 ? -1 : coindex);
        this.value = value;
    }

    public static AtomicValue with(String value) {
        return new AtomicValue(-1, value);
    }

    public static AtomicValue with(int coindex, String value) {
        return new AtomicValue(coindex, value);
    }

    @Override
    public int getCoindex() {
        return this.coindex;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return (coindex < 0 ? "" : "(" + coindex + ")") + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtomicValue atomic = (AtomicValue) o;
        return Objects.equals(value, atomic.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
