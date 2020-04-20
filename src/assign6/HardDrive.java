package assign6;

public class HardDrive implements Cloneable {
    private String name;
    private String type;
    private int capacity;

    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("Hard drive " + name + " is " + type + " and has %d GB", capacity);
    }

    @Override
    protected HardDrive clone() throws CloneNotSupportedException {
        HardDrive cloned = (HardDrive) super.clone();
        cloned.name = this.name + " (clone)";
        return cloned;
    }
}
