package assign5;

public class HybridCar extends Car implements Tankable, Chargeable{
    private boolean tanked;
    private boolean charged;

    public HybridCar(String manufacturer, String model, boolean tanked, boolean charged) {
        super(manufacturer, model);
        this.tanked = tanked;
        this.charged = charged;
    }

    public HybridCar(String manufacturer, String model) {
        this(manufacturer, model,false,false);
    }

    @Override
    public void charge() {
        this.charged = true;
        System.out.println(this.getManufacturer() + " " + this.getModel() + " has been charged");
    }

    @Override
    public void tank() {
        this.tanked = true;
        System.out.println(this.getManufacturer() + " " + this.getModel() + " has been tanked");
    }
}
