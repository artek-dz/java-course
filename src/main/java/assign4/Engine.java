package assign4;

public class Engine {
    private final String name;
    private double horsepower;
    private double capacity;
    private boolean started;

    public Engine(String name, double horsepower, double capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
        this.started = false;
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
        return started;
    }

    public void start() {
        if (!started) {
            started = true;
            System.out.println( name + " engine has been started");
        } else {
            System.out.println(name + " engine has already been started");
        }
    }

    public void stop() {
        if (started) {
            started =  false;
            System.out.println( name + " engine has been stopped");
        } else {
            System.out.println(name + " engine has already been stopped");
        }
    }
}
