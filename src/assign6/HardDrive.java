package assign6;

public class HardDrive {
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

    @Override
    public String toString() {
        return String.format("Hard drive " + name + " is " + type + " and has %d GB", capacity);
    }
}
