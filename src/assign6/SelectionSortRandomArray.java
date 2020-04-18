package assign6;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class SelectionSortRandomArray {
    public static void main(String[] args) {
        LinkedList<Integer> testList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            testList.addLast(ThreadLocalRandom.current().nextInt(200));
        }

        System.out.println(testList);
        System.out.println(selectionSort(testList));
    }

    public static LinkedList<Integer> selectionSort(LinkedList<Integer> list) {
        LinkedList<Integer> sortedList = new LinkedList<>();
        LinkedList<Integer> unsortedList = list;
        do {
            Integer sorted = unsortedList.getFirst();
            int sortedIndex = 0;
            for (Integer unsorted : unsortedList) {
                if (unsorted < sorted) {
                    sortedIndex = unsortedList.indexOf(unsorted);
                    sorted = unsorted;
                }
            }
            sortedList.addLast(sorted);

            unsortedList.set(sortedIndex, unsortedList.getFirst());
            unsortedList.removeFirst();

        } while (!unsortedList.isEmpty());
        return sortedList;
    }
}
