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

    public List<Item> sortCatalogueLowestPriceFirst() {
        return sortCatalogue(new ItemByPrice());
    }

    public List<Item> sortCatalogueHighestPriceFirst() {
        return sortCatalogue(new ItemByPrice().reversed());
    }

    public List<Item> sortCatalogueByNameAtoZ() {
        return sortCatalogue(new ItemByName());
    }

    public List<Item> sortCatalogueByNameZtoA() {
        return sortCatalogue(new ItemByName().reversed());
    }

    private List<Item> sortCatalogue(Comparator<Item> itemComparator) {
        List<Item> copy = new ArrayList<>(this.catalogue);
        copy.sort(itemComparator);
        return copy;
    }
}
