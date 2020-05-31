package assign4;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class BubbleSortRandomArray2 {
    public static void main(String[] args) {
//          int[] toSort = new int[20];
//          Arrays.setAll(toSort, i -> ThreadLocalRandom.current().nextInt(200));
        int[] toSort = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1};
//        int[] toSort = new int[]{1,3,2};

        System.out.println("Unsorted array: " + Arrays.toString(toSort));
        int swapped;
        int count = 0;
        int j = toSort.length;
        boolean sorted = false;
        while (j > 1 && !sorted) {
            for (int i = j - 1; i > 0; i--) {
                sorted = true;
                if (toSort[i] < toSort[i - 1]) {
                    swapped = toSort[i];
                    toSort[i] = toSort[i - 1];
                    toSort[i - 1] = swapped;
                    sorted = false;
                }
            }
            count++;
            j--;
        }
        System.out.println("Sorted array:   " + Arrays.toString(toSort));
        System.out.format("It took %d loops to sort this array.", count);
    }
}