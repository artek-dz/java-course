package assign4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSortRandomArray3 {
    public static void main(String[] args) {
//          int[] toSort = new int[20];
//          Arrays.setAll(toSort, i -> ThreadLocalRandom.current().nextInt(200));
//        int[] toSort = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1};
        int[] toSort = new int[]{1,3,2};

        System.out.println("Unsorted array: " + Arrays.toString(toSort));
        int swapped;
        int count = 0;
        int j = toSort.length;
        do {
            int lastSwapped = 0;
            for (int i = 1; i < j; i++) {
                if (toSort[i] < toSort[i - 1]) {
                    swapped = toSort[i - 1];
                    toSort[i - 1] = toSort[i];
                    toSort[i] = swapped;
                    lastSwapped = i;
                }
            }
            count++;
            j = lastSwapped;
        } while (j > 1);

        System.out.println("Sorted array:   " + Arrays.toString(toSort));
        System.out.format("It took %d loops to sort this array.", count);
    }
}
