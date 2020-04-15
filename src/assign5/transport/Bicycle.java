package assign5.transport;

public class Bicycle extends TwoWheeler {
    Bicycle(String name) {
        super(name);
        System.out.println("Bicycle object created");
    }
    @Override
    void ride(int distance) {
        System.out.println("Bicycle " + this.getName() + " has been ridden for " + distance +" km.");
    }
}
