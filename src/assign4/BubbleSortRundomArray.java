package assign4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSortRundomArray {
    public static void main(String[] args) {
        int[] toSort = new int[20];
        Arrays.setAll(toSort, i -> ThreadLocalRandom.current().nextInt(200));

        System.out.println("Unsorted array: " + Arrays.toString(toSort));
        int swapped;
        for (int j = toSort.length; j > 1; j--) {
            for (int i = 1; i < j; i++) {
                if (toSort[i] < toSort[i - 1]) {
                    swapped = toSort[i - 1];
                    toSort[i - 1] = toSort[i];
                    toSort[i] = swapped;
                }
            }
        }
        System.out.println("Sorted array:   " + Arrays.toString(toSort));
    }
}
