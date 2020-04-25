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

    public void sortCatalogueLowestPriceFirst() {
        sortCatalogue(new ItemByPrice());
    }

    public void sortCatalogueHighestPriceFirst() {
        sortCatalogue(new ItemByPrice().reversed());
    }

    public void sortCatalogueByNameAtoZ() {
        sortCatalogue(new ItemByName());
    }

    public void sortCatalogueByNameZtoA() {
        sortCatalogue(new ItemByName().reversed());
    }

    private void sortCatalogue(Comparator<Item> itemComparator) {
        System.out.println("Before sorting: " + this.catalogue);
        List<Item> copy = new ArrayList<>(this.catalogue);
        copy.sort(itemComparator);
        System.out.println("After sorting:  " + copy + "\n");
    }
}
