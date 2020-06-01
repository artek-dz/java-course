package assign11;

public abstract class FeatureValue {
    private int coindex;
    private boolean atomic;

    protected FeatureValue(int coindex, boolean atomic) {
        this.coindex = (coindex < 0 ? -1 : coindex);
        this.atomic = atomic;
    }

    public boolean isAtomic() {
        return atomic;
    }

    public int getCoindex() {
        return this.coindex;
    }


    @Override
    public String toString() {
        return (coindex < 0 ? "" : "(" + coindex + ")");
    }
}
