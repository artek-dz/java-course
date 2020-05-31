package assign5.transport;

public class Train extends PublicTransport {
    Train(String name) {
        super(name);
        System.out.println("Train object created");
    }

    @Override
    void sellTicket(String ticket) {
        super.sellTicket(ticket);
        System.out.println("Please show your ticket if asked.");
    }
}
