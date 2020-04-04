package assign5;

public class FuelCar extends Car implements Tankable{
    private boolean tanked;

    public FuelCar(String manufacturer, String model, boolean tanked) {
        super(manufacturer, model);
        this.tanked = tanked;
    }

    public FuelCar(String manufacturer, String model) {
        this(manufacturer, model, false);
    }

    @Override
    public void tank() {
        this.tanked = true;
        System.out.println(this.getManufacturer() + " " + this.getModel() + " has been tanked");
    }
}
