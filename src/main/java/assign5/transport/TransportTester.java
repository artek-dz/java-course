package assign5.transport;

public class TransportTester {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing 737");
        drive(airplane1,10);
        fly(airplane1, 80);

        System.out.println("=================================================");
        Transport airplane2 = new Transport("Boeing 767");
        drive(airplane2,170);
        fly(airplane2, 760);

        System.out.println("=================================================");
        Bicycle bicycle = new Bicycle("My bike");
        drive(bicycle,13);
        ride(bicycle,13);
        fly(bicycle,100);

        System.out.println("=================================================");
        TwoWheeler motorbike = new Motorbike("My motorbike");
        drive(motorbike,13);
        ride(motorbike,13);
        fly(motorbike,15);

        System.out.println("=================================================");
        Scooter scooter1 = new Scooter("My scooter");
        drive(scooter1, 10);
        ride(scooter1, 14);
        fly(scooter1, 20);

        System.out.println("=================================================");
        Car car = new Car("Toyota");
        drive(car, 10);

        System.out.println("=================================================");
        PublicTransport public1 = new Bus("Bus 114");
        sellTicket(public1, "60 min ticket");

        System.out.println("=================================================");
        Tram tram1 = new Tram("Tram 22");
        drive(tram1, 105);
        sellTicket(tram1, "90 min ticket");

        System.out.println("=================================================");
        PublicTransport train1 = new Train("Intercity Polanin");
        drive(train1,150);
        sellTicket(train1, "2nd class ticket");

    }


    private static void drive (Transport transport, int distance) {
        transport.drive(distance);
    }

    private static void fly (Transport transport, int distance) {
        transport.fly(10);
    }

    private static void ride (TwoWheeler twoWheeler, int distance) {
        twoWheeler.ride(distance);
    }

    private static void sellTicket (PublicTransport publicTransport, String ticket ) {
        publicTransport.sellTicket(ticket);
    }




}
