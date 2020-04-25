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
       this.catalogue.sort(new ItemByPrice());
        System.out.println(this.catalogue);
    }

    public void sortCatalogueHighestPriceFirst() {
        this.catalogue.sort(new ItemByPrice().reversed());
        System.out.println(this.catalogue);
    }

    public void sortCatalogueAtoZ () {
        this.catalogue.sort(new ItemByName());
        System.out.println(this.catalogue);
    }

    public void sortCatalogueZtoA () {
        this.catalogue.sort(new ItemByName().reversed());
        System.out.println(this.catalogue);
    }
}
