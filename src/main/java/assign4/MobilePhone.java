package assign4;

public class MobilePhone {
    private final String brand;
    private final String model;
    private final int batteryCapacity;
    private int batteryAmount;
    private final int memory;
    private int freeMemory;

    public String getName() {
        return brand + " " + model;
    }

    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }

    public void installApplication(String application, int memoryUsage) {
        if (freeMemory > memoryUsage) {
            freeMemory -= memoryUsage;
            System.out.println("Application " + application + " has been installed on " + this.getName() + ". Remaining memory: " + freeMemory
                    + " MB.");
        } else {
            System.out.println("Application " + application + " can't be installed on " + this.getName() + ". There isn't enough memory.");
        }
    }

    public void use(String application, int hours) {
        if (batteryAmount > hours * 100) {
            batteryAmount -= hours * 100;
            System.out.println("Application " + application + " has been ran for " + hours + " hours on " + this.getName() + ". Remaining battery capacity: " + batteryAmount + " mAh.");
        } else if (batteryAmount > 0) {
            hours = batteryAmount / 100;
            batteryAmount = 0;
            System.out.println("Application " + application + " has been ran for " + hours + " hours on " + this.getName() + ". Phone has been discharged.");
        } else {
            System.out.println("Application " + application + " can't be run on " +  this.getName() + ". Phone is discharged.");
        }
    }

    public void charge() {
        batteryAmount = batteryCapacity;
        System.out.println(this.getName() + " has been charged. Remaining battery capacity: " + batteryAmount + " mAh.");
    }
}
