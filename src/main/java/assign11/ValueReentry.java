package assign11;

public class ValueReentry extends FeatureValue {
    private ValueReentry(int coindex, boolean atomic) {
        super(coindex, atomic);
    }

    public static ValueReentry with(int coindex, boolean atomic) {
        return new ValueReentry(coindex, atomic);
    }

    public static ValueReentry with(FeatureValue value) {
        return new ValueReentry(value.getCoindex(),value.isAtomic());
    }
}
