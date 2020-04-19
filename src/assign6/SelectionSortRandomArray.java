package assign6;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSortRandomArray {
    public static void main(String[] args) {
        List<Integer> linked = new LinkedList<>();
        List<Integer> array = new ArrayList<>();
        long start;
        for (int i = 0; i < 2000; i++) {
            Integer e = ThreadLocalRandom.current().nextInt(20000);
            linked.add(e);
            array.add(e);
        }
        System.out.println("Linked list: " + linked);
        System.out.println("===========================================");
        start = System.currentTimeMillis();
        System.out.println("Sorted list: " + selectionSort(linked));
        System.out.format("Linked list sorted in %d millis \n", System.currentTimeMillis() - start);
        System.out.println("===========================================");
        start = System.currentTimeMillis();
        System.out.println("Sorted list: " + selectionSort(array));
        System.out.format("Array list sorted in %d millis \n", System.currentTimeMillis() - start);
    }

    public static List<Integer> selectionSort(LinkedList<Integer> list) {
        LinkedList<Integer> sorted = new LinkedList<>();
        do {
            Integer swapped = list.getFirst();
            Integer minimal = list.getFirst();
            int j = 0;
            for (Integer element : list) {
                if (element < minimal) {
                    minimal = element;
                    j = list.indexOf(element);
                }
            }
            sorted.addLast(minimal);
            list.set(j, swapped);
            list.removeFirst();
        } while (!list.isEmpty());
        return sorted;
    }

    private static List<Integer> selectionSort(List<Integer> list) {
//        if (list instanceof LinkedList) {
//            return selectionSort((LinkedList) list);
//        }  //Comment out to optimize selection sorting for linked List
        for (int i = 0; i < list.size(); i++) {
            Integer swapped = list.get(i);
            Integer minimal = list.get(i);
            int j = i;
            for (int k = i + 1; k < list.size(); k++) {
                if (list.get(k) < minimal) {
                    minimal = list.get(k);
                    j = k;
                }
            }
            list.set(i, minimal);
            list.set(j, swapped);
        }
        return list;
    }
}
