package assign6;

public class Laptop implements Cloneable {
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private int randomAccessMemory;

    public Laptop(String name, Processor processor, HardDrive hardDrive, int displaySize, int randomAccessMemory) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.randomAccessMemory = randomAccessMemory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public String getName() {
        return name;
    }

    public Processor getProcessor() {
        return processor;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    @Override
    public String toString() {
        return String.format("Laptop " + name + " has " + processor.getName() + " processor, "
                + hardDrive.getName() + " hard drive, %d inch display and %d GB RAM", displaySize, randomAccessMemory);
    }
    @Override
    protected Laptop clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        cloned.name = this.name + " (clone)";
        cloned.setProcessor(cloned.getProcessor().clone());
        cloned.setHardDrive(cloned.getHardDrive().clone());
        return cloned;
    }
}
