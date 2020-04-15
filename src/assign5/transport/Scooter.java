package assign5.transport;

public class Scooter extends Motorbike {
    Scooter(String name) {
        super(name);
        System.out.println("Scooter object created");
    }
    @Override
    void ride(int distance) {
        System.out.println("Scooter " + this.getName() + " has been ridden for " + distance +" km.");
    }
}
