package assign6;

public class LaptopTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Processor intel = new Processor("Intel Core i5-1035G7",3.70,4);
        HardDrive ssd = new HardDrive("M.2 PCIe","SSD",256);
        Laptop surface = new Laptop("Microsoft Surface Laptop 3 i5/8GB/256",intel,ssd,13,5);
        System.out.println(surface.hashCode());
        System.out.println(surface);
        System.out.println(surface.getProcessor());
        System.out.println(surface.getHardDrive());

        System.out.println("==============cloning===============");
        Laptop  surface2 = surface.clone();

        System.out.println(surface2.hashCode());
        System.out.println(surface2);
        System.out.println(surface2.getProcessor());
        System.out.println(surface2.getHardDrive());

        System.out.println("==============testing===============");
        surface2.setDisplaySize(15);
        surface2.getProcessor().setName("Intel Core i5-1035g4");

        System.out.println(surface.getDisplaySize());
        System.out.println(surface.getProcessor().getName());

        System.out.println(surface2.getDisplaySize());
        System.out.println(surface2.getProcessor().getName());

    }
}
