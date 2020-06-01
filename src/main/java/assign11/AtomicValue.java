package assign11;

import java.util.Objects;

public class AtomicValue extends FeatureValue {

    private String value;

    private AtomicValue(int coindex, String value) {
        super(coindex);
        this.value = value;
    }

    public static AtomicValue with(String value) {
        return new AtomicValue(-1, value);
    }

    public static AtomicValue with(int coindex, String value) {
        return new AtomicValue(coindex, value);
    }



    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + value;
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
