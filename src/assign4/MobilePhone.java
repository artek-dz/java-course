package assign4;

public class MobilePhone {
    private final String brand; // phones can't be re-branded
    private final String model; // phones have a specific model which can't be changed
    private final int batteryCapacity;
    private int batteryAmount;
    private final int memory;
    private int freeMemory;

    public MobilePhone(String brandAndModel, int batteryCapacity, int memory) {
        String[] parts = brandAndModel.split(" ", 2);
        this.brand = parts[0];
        this.model = parts[1];
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity; // phones are fully charged when created
        this.memory = memory;
        this.freeMemory = memory; //
 //       System.out.println("Your phone is ready to be used.");
    }

    public void installApplication(String application, int memoryUsage) {
        if (freeMemory > memoryUsage) {
            freeMemory -= memoryUsage;
            System.out.println("Application " + application + " has been installed on " + brand + " " + model + ". Remaining memory: " + freeMemory
                    + " MB.");
        } else {
            System.out.println("Application " + application + " can't be installed on " + brand + " " + model + ". There isn't enough memory.");
        }
    }

    public void use(String application, int hours) {
        if (batteryAmount > hours * 100) {
            batteryAmount -= hours * 100;
            System.out.println("Application " + application + " has been ran for " + hours + " hours on " + brand + " " + model + ". Remaining battery capacity: " + batteryAmount + " mAh.");
        } else if (batteryAmount > 0) {
            hours = batteryAmount / 100;
            batteryAmount = 0;
            System.out.println("Application " + application + " has been ran for " + hours + " hours on " + brand + " " + model + ". Phone has been discharged.");
        } else {
            System.out.println("Application " + application + " can't be run on " +  brand + " " + model + ". Phone is discharged.");
        }
    }

    public void charge() {
        batteryAmount = batteryCapacity;
        System.out.println(brand + " " + model + " has been charged. Remaining battery capacity: " + batteryAmount + " mAh.");
    }
}
