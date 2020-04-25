package assign7.onlinestore;

import assign7.onlinestore.Item;

import java.util.Comparator;

public class ItemByName implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getName().compareTo(item2.getName());
    }
}
