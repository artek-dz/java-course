package assign7.parts;

public class Part {
    private String brand;
    private String name;

    public Part(String brand, String name) {
        this.brand = brand;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Part{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
