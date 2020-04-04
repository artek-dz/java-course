package assign5;

class CarTest {
    public static void main(String[] args) {
        Car[] cars = new Car[6];
        cars[0] = new ElectricCar("Nissan", "Leaf");
        cars[1] = new ElectricCar("Ford", "Focus");
        cars[2] = new FuelCar("Toyota", "Mirai");
        cars[3] = new FuelCar("Hyundai", "Nexo");
        cars[4] = new HybridCar("Malibu", "Hybrid");
        cars[5] = new HybridCar("Kia", "Niro");

        for (Car car : cars) {
            if (car instanceof Tankable) {
                ((Tankable) car).tank();
            }
            if (car instanceof Chargeable) {
                ((Chargeable) car).charge();
            }
        }
    }
}