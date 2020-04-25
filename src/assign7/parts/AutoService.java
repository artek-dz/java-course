package assign7.parts;

import java.util.*;

public class AutoService {
    private String name;
    private TreeMap<Integer, Part> catalogue;

    public AutoService(String name, TreeMap<Integer, Part> catalogue) {
        this.name = name;
        this.catalogue = catalogue;
    }
    public Part getPart(int partNumber) {
        return this.catalogue.get(partNumber);
    }

    @Override
    public String toString() {
        return "AutoService{" +
                "name='" + name + '\'' +
                ", catalogue=" + catalogue +
                '}';
    }
}
