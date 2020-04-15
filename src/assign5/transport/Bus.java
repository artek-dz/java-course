package assign5.transport;

public class Bus extends PublicTransport {
    Bus(String name) {
        super(name);
        System.out.println("Bus object created");
    }

    @Override
    void sellTicket(String ticket) {
        super.sellTicket(ticket);
        System.out.println("Please validate your ticket.");
    }
}
