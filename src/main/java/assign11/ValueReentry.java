package assign11;

public class ValueReentry implements FeatureValue {
    private int coindex;

    private ValueReentry(int coindex) {
        this.coindex = (coindex < 0 ? -1 : coindex);
    }

    public static ValueReentry with(int coindex) {
        return new ValueReentry(coindex);
    }

    @Override
    public int getCoindex() {
        return this.coindex;
    }

    @Override
    public String toString() {
        return coindex < 0 ? "" : "(" + coindex + ")";
    }
}
