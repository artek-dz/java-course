package assign5.transport;

public class PublicTransport extends Transport {
    PublicTransport(String name) {
        super(name);
        System.out.println("Public transport object created");
    }

    @Override
    void fly(int distance) {
        System.out.println("You can't fly using public transport");
    }

    void sellTicket (String ticket) {
        System.out.println( ticket + " sold.");
      }
}
