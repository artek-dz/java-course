package assign9.box;


import java.util.HashSet;
import java.util.Set;

public class Shelf<T> {
    Set<Box<? extends T>> boxes = new HashSet<>();

    public Shelf() {

    }

    public void add(Box<? extends T> box) {
        boxes.add(box);
    }

    @Override
    public String toString() {
        return "Shelf"+ boxes;
    }

    public Set<Box<? extends T>> getBoxes() {
        return boxes;
    }
}
