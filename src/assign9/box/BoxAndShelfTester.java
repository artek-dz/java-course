package assign9.box;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxAndShelfTester {

    public static void main(String[] args) {

        Box<Book> boxOfBooks = new Box<>();
        boxOfBooks = makeBooks("book");
        System.out.println(boxOfBooks.toString());

        Box<Toy> boxOfToys = new Box<>();
        boxOfToys = makeToys("toy");
        System.out.println(boxOfToys.toString());

        Box<Food> boxOfFoods = new Box<>();
        boxOfFoods = makeFoods("food");
        System.out.println(boxOfFoods.toString());

        Box<Item>  boxOfItems = new Box<>();
        boxOfItems.addAll(boxOfBooks.getItems());
        boxOfItems.addAll(boxOfFoods.getItems());
        boxOfItems.addAll(boxOfToys.getItems());

        System.out.println(boxOfItems.toString());

        Box<Fantasy> boxOfFantasyBooks = new Box<>();
        boxOfFantasyBooks = makeFantasyBooks("food");
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
        String[] bookNames = new String[5];
        Arrays.setAll(bookNames, i -> name + i);
        List<Book> books = new ArrayList<>();

        for (String bookName : bookNames) {
            books.add(new Book(bookName));
        }
        Box<Book> boxOfBooks = new Box<>(books);
        return boxOfBooks;
    }
    private static Box<Toy> makeToys(String name) {
        String[] toyNames = new String[5];
        Arrays.setAll(toyNames, i -> name + i);
        List<Toy> toys = new ArrayList<>();

        for (String toyName : toyNames) {
            toys.add(new Toy(toyName));
        }

        Box<Toy> boxOfToys = new Box<>(toys);
        return boxOfToys;
    }

    private static Box<Food> makeFoods(String name) {
        String[] foodNames = new String[5];
        Arrays.setAll(foodNames, i -> name + i);
        List<Food> foods = new ArrayList<>();

        for (String foodName : foodNames) {
            foods.add(new Food(foodName));
        }

        Box<Food> boxOfFoods = new Box<>(foods);
        return boxOfFoods;
    }

    private static Box<Fantasy> makeFantasyBooks(String name) {
        String[] fantasyNookNames = new String[5];
        Arrays.setAll(fantasyNookNames, i -> "fantasy" + i);
        List<Fantasy> fantasyBooks = new ArrayList<>();

        for (String fantasyName : fantasyNookNames) {
            fantasyBooks.add(new Fantasy(fantasyName));
        }

        Box<Fantasy> boxOfFantasyBooks = new Box<>(fantasyBooks);
        return boxOfFantasyBooks;
    }
}
