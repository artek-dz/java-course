package assign6;

public class Processor implements Cloneable{
    private String name;
    private double frequency;
    private int coreNumber;

    public Processor(String name, double frequency, int coreNumber) {
        this.name = name;
        this.frequency = frequency;
        this.coreNumber = coreNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Processor " + name + " has %.2f GHz and %d cores", frequency , coreNumber);
    }

    @Override
    protected Processor clone() throws CloneNotSupportedException {
        Processor cloned = (Processor) super.clone();
        cloned.name = this.name + " (clone)";
        return cloned;
    }
}
