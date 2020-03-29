package assign4;

public class Engine {
    private final String name;
    private double horsepower;
    private double capacity;
    private boolean isStarted;

    public Engine(String name, double horsepower, double capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
        this.isStarted = false;
    }

    public String getName() {
        return name;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public double getCapacity() {
        return capacity;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void turnOnOff() {
        isStarted = !isStarted;
    }
}
