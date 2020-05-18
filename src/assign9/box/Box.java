package assign9.box;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Box<T> {
    List<T> items = new ArrayList<>();

    public Box(List<T> items) {
        this.items = items;
    }

    public Box() {

    }

    public void add(T item) {
        items.add(item);
    }

    public void addAll(List<? extends T> list) {
        this.items.addAll(list);
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(items, box.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        return "Box" + items;
    }
}
