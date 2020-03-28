package assign4;

public class Engine {
    private final String name;
    private double horsePower;
    private double capacity;
    private boolean isStarted;


    public Engine(String name, double horsePower, double capacity) {
        this.name = name;
        this.horsePower = horsePower;
        this.capacity = capacity;
        this.isStarted = false;
    }

    public boolean isStarted() {
        return isStarted;
    }
    
    public void turnOnOff() {
        isStarted = !isStarted;
    }
}
