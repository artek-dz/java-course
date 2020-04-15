package assign5.transport;

public class Airplane extends Transport {
    Airplane(String name) {
        super(name);
        System.out.println("Airplane object created");
    }

    @Override
    void drive(int distance) {
        System.out.println("Airplanes can't be driven, use method .fly instead");
    }

    @Override
    void fly(int distance) {
        System.out.println("Plane " + this.getName() + "has been flown for " + distance + " km.");
    }

}
