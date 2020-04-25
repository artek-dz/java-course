package assign7.onlinestore;

import java.util.Comparator;

public class ItemByPrice implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getPrice().compareTo(item2.getPrice());
    }

}
