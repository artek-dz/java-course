package assign5.transport;

public class TwoWheeler extends Transport {
    TwoWheeler(String name) {
        super(name);
        System.out.println("Two wheeler object created");
    }
    @Override
    void drive(int distance) {
        System.out.println("Two wheelers can't be driven, use method .ride instead");
    }

    @Override
    void fly(int distance) {
        System.out.println("You can't fly with a two wheeler.");
    }

    void ride(int distance) {
        System.out.println(this.getName() + " has been ridden for " + distance + " km.");
    }
}
