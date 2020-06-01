package assign11;

public abstract class FeatureValue {
    private int coindex;

    protected FeatureValue(int coindex) {
        this.coindex = (coindex < 0 ? -1 : coindex);
    }

    public int getCoindex() {
        return this.coindex;
    }

    @Override
    public String toString() {
        return (coindex < 0 ? "" : "(" + coindex + ")");
    }
}
