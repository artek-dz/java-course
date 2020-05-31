package assign5.transport;

public class Car extends Transport {
    Car(String name) {
        super(name);
        System.out.println("Car object created");
    }

    @Override
    void drive(int distance) {
        System.out.println("Car " + this.getName() + " has been driven for " + distance + " km.");
    }
}
