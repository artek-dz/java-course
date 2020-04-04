package assign5;

public class ElectricCar extends Car implements Chargeable{
    private boolean charged;

    public ElectricCar(String manufacturer, String model, boolean charged) {
        super(manufacturer, model);
        this.charged = charged;
    }

    public ElectricCar(String manufacturer, String model) {
        this( manufacturer,  model,  false);
    }

    @Override
    public void charge() {
        this.charged = true;
        System.out.println(this.getManufacturer() + " " + this.getModel() + " has been charged");
    }
}
