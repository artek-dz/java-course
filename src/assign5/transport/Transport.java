package assign5.transport;

public class Transport {
    private String name;

    Transport(String name) {
        this.name = name;
        System.out.println("Transport object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void drive(int distance) {
        System.out.println(name + " has been driven for " + distance + " km.");
    }

    void fly(int distance) {
        System.out.println(name + " has been flown for " + distance + " km.");
    }


}
