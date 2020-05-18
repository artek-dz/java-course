package assign9.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class BoxAndShelfTester {

    public static void main(String[] args) {

        Box<Book> boxOfBooks = makeBooks("book");
        System.out.println(boxOfBooks.toString());

        Box<Toy> boxOfToys = makeToys("toy");
        System.out.println(boxOfToys.toString());

        Box<Food> boxOfFoods = makeFoods("food");
        System.out.println(boxOfFoods.toString());

        Box<Item> boxOfItems = new Box<>();
        boxOfItems.addAll(boxOfBooks.getItems());
        boxOfItems.addAll(boxOfFoods.getItems());
        boxOfItems.addAll(boxOfToys.getItems());

        System.out.println(boxOfItems.toString());

        Box<Fantasy> boxOfFantasyBooks = makeFantasyBooks("food");
        System.out.println(boxOfFantasyBooks.toString());

        Shelf<Toy> shelf1 = new Shelf<>();
        shelf1.add(boxOfToys);
        System.out.println(shelf1);

        Shelf<Book> shelf2 = new Shelf<>();
        shelf2.add(boxOfBooks);
        shelf2.add(boxOfFantasyBooks);
        System.out.println(shelf2);

        List<String> strings = new ArrayList<String>();
        strings.add("string1");
        Box<String> boxOfStrings = new Box<>(strings);

        Shelf<Object> shelf3 = new Shelf<>();

        shelf3.add(boxOfFoods);
        shelf3.add(boxOfToys);
        shelf3.add(boxOfStrings);

        System.out.println(shelf3);
        System.out.println(shelf3.getBoxes());

    }


    private static Box<Book> makeBooks(String name) {
        return makeItems("name", Book::new);
    }

    private static Box<Toy> makeToys(String name) {
        return makeItems("name", Toy::new);
    }

    private static Box<Food> makeFoods(String name) {
        return makeItems("name", Food::new);
    }

    private static Box<Fantasy> makeFantasyBooks(String name) {
        return makeItems("name", Fantasy::new);
    }

    private static <T> Box<T> makeItems(String name, Function<String, T> constructor) {
        String[] itemNames = new String[5];
        Arrays.setAll(itemNames, i -> name + i);
        List<T> items = new ArrayList<>();
        for (String itemName : itemNames) {
            items.add(constructor.apply(itemName));
        }
        return new Box<>(items);
    }
}
