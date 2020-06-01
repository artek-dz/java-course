package assign11;

public class ValueReentry extends FeatureValue {
    private ValueReentry(int coindex) {
        super(coindex);
    }

    public static ValueReentry with(int coindex) {
        return new ValueReentry(coindex);
    }
}
