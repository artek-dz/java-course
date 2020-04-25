package assign7.onlinestore;

import java.util.*;

public class OnlineStore {
    private String name;
    private List<Item> catalogue;

    public OnlineStore(String name, List<Item> catalogue) {
        this.name = name;
        this.catalogue = catalogue;
    }

    public String getName() {
        return name;
    }

    public List<Item> getCatalogue() {
        return catalogue;
    }

    public void sortCatalogue() {
        sortCatalogue(new ItemByName());
    }

    public void sortCatalogue(Comparator<Item> itemComparator) {
        System.out.println("Before sorting: " + this.catalogue);
        List<Item> copy = new ArrayList<Item>();
        copy.addAll(this.catalogue);
        copy.sort(itemComparator);
        System.out.println("After sorting:  " + copy + "\n");
    }
}
