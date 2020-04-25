package assign7.autoservice;

import java.util.TreeMap;

public class AutoServiceTester {
    public static void main(String[] args) {
        Part part0 = new Part("Cadillac", "bumper");
        Part part1 = new Part("Rolls Royce", "engine");
        Part part2 = new Part("Mitsubishi", "cylinder");
        Part part3 = new Part("Generic", "windshield");
        Part part4 = new Part("Cadillac", "bumper");
        Part part5 = new Part("Rolls Royce", "engine 1");
        Part part6 = new Part("Mitsubishi", "cylinder 2");
        Part part7 = new Part("Generic", "windshield 3");

        TreeMap<Integer, Part> catalogue = new TreeMap<>();


        catalogue.put(1366, part0);
        catalogue.put(3434, part1);
        catalogue.put(5454, part2);
        catalogue.put(7676, part3);
        catalogue.put(3436, part4);
        catalogue.put(6786, part5);
        catalogue.put(1416, part6);
        catalogue.put(1246, part7);

        AutoService autoService = new AutoService("Autoserwis pana Waldka",catalogue);

        System.out.println(autoService);

        System.out.println(autoService.getPart(3436));

    }
}
