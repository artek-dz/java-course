package assign7.onlinestore;

import java.math.BigDecimal;
import java.util.*;

public class OnlineStoreTester {

    public static void main(String[] args) {
        Item item0 = new Item("tea", new BigDecimal("10"));
        Item item1 = new Item("coffee", new BigDecimal("17"));
        Item item2 = new Item("sandwich", new BigDecimal("6"));
        Item item3 = new Item("bananas", new BigDecimal("4"));

        List<Item> catalogue = new ArrayList<>();
        catalogue.add(item0);
        catalogue.add(item1);
        catalogue.add(item2);
        catalogue.add(item3);

        OnlineStore onlineStore = new OnlineStore("żabka", catalogue);
        System.out.println("Original catalogue");
        System.out.println(catalogue);
        System.out.println("Sorted catalogue copies");
        System.out.println(onlineStore.sortCatalogueLowestPriceFirst());
        System.out.println(onlineStore.sortCatalogueHighestPriceFirst());
        System.out.println(onlineStore.sortCatalogueByNameAtoZ());
        System.out.println(onlineStore.sortCatalogueByNameZtoA());


    }
}
