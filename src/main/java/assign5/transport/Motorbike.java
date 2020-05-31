package assign5.transport;

public class Motorbike extends TwoWheeler {
    Motorbike(String name) {
        super(name);
        System.out.println("Motorbike object created");
    }

    @Override
    void ride(int distance) {
        System.out.println("Motorbike " + this.getName() + " has been ridden for " + distance +" km.");
    }
}
