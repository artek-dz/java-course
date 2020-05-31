package assign6;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSortRandomArray {
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        long start;
        for (int i = 0; i < 10_000; i++) {
            Integer e = ThreadLocalRandom.current().nextInt(20000);
            linked.addLast(e);
            array.add(e);
        }
        System.out.println("Linked list: " + linked);
        selectionSort(linked);
        selectionSort(array);
    }

    public static List<Integer> selectionSort(LinkedList<Integer> list) {
        long start = System.currentTimeMillis();
        LinkedList<Integer> sorted = new LinkedList<>();
        do {
            Integer swapped = list.getFirst();
            Integer minimal = list.getFirst();
            int indexOfMinimal = 0;
            for (Integer element : list) {
                if (element < minimal) {
                    minimal = element;
                    indexOfMinimal = list.indexOf(element);
                }
            }
            sorted.addLast(minimal);
            list.set(indexOfMinimal, swapped);
            list.removeFirst();
        } while (!list.isEmpty());
        long end = System.currentTimeMillis();
        System.out.format("Sorted in %d millis \n", end - start);
        return sorted;
    }

    private static List<Integer> selectionSort(ArrayList<Integer> list) {
        long start = System.currentTimeMillis();
        for (int indexOfSwapped = 0; indexOfSwapped < list.size(); indexOfSwapped++) {
            Integer swapped = list.get(indexOfSwapped);
            Integer minimal = list.get(indexOfSwapped);
            int indexOfMinimal = indexOfSwapped;
            for (int i = indexOfSwapped + 1; i < list.size(); i++) {
                if (list.get(i) < minimal) {
                    minimal = list.get(i);
                    indexOfMinimal = i;
                }
            }
            list.set(indexOfSwapped, minimal);
            list.set(indexOfMinimal, swapped);
        }
        long end = System.currentTimeMillis();
        System.out.format("Sorted in %d millis \n", end - start);
        return list;
    }
}
