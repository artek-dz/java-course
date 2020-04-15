package assign5.transport;

public class Tram extends PublicTransport {
    Tram(String name) {
        super(name);
        System.out.println("Tram object created");
    }

    @Override
    void sellTicket(String ticket) {
        super.sellTicket(ticket);
        System.out.println("Please validate your ticket.");
    }
}
