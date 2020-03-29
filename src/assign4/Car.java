package assign4;

public class Car {
    private final String name;
    private Engine engine;
    private double tankCapacity;
    private double remainingFuel;

    public Car(String name, Engine engine, double tankCapacity) {
        this.name = name;
        this.engine = engine;
        this.tankCapacity = tankCapacity;
        this.remainingFuel = tankCapacity;
    }

    public String getName() {
        return name;
    }

    public void tank() {
        this.remainingFuel = tankCapacity;
        System.out.println("Car " + name + " has been tanked up");
    }

    public void drive(double speed, double distance) {
        if (engine.isStarted()) {
            if (remainingFuel > 0) {
                speed = Math.min(speed, 2 * engine.getHorsepower());
                distance = Math.min(distance, 10000 * remainingFuel / engine.getCapacity());

                remainingFuel -= distance * engine.getCapacity() / 10000;

                System.out.format("Car " + name + " has been driven for %.0f km with speed %.0fkm/h. ", distance, speed);
                if (remainingFuel > 0) {
                    System.out.format("Remaining fule: %.0fL \n", remainingFuel);
                } else {
                    System.out.println("Tank is empty");
                }
            } else {
                System.out.println("Car " + name + " can't be driven. Tank is empty");
            }
        } else {
            System.out.println("Car " + name + " can't be driven because engine is stopped");
        }
    }

    public void startEngine() {
        if (!engine.isStarted()) {
            System.out.println("Car " + name + " is starting " + engine.getName() + " engine");
        }
        engine.start();
    }

    public void stopEngine() {
        if (engine.isStarted()) {
            System.out.println("Car " + name + " is stopping " + engine.getName() + " engine");
        }
        engine.stop();
    }
}
