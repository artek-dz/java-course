package assign6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSortRandomArray {
    public static void main(String[] args) {

        System.out.println("============== Test of merge for left and right sorted ==============");
        List<Integer> left = Arrays.asList(3, 27, 38, 43);
        List<Integer> right = Arrays.asList(9, 10, 82);
        System.out.println(left);
        System.out.println(right);
        System.out.println(merge(left, right));
        System.out.println("============= Test of merge for partially sorted list ===============");
        List<Integer> partial = Arrays.asList(3, 27, 38, 43, 9, 10, 82);
        System.out.println(partial);
        System.out.println(merge(partial, 0, 3, 6));
        System.out.println("=============Test of merge for mergeSort of unsorted list===============");
        List<Integer> list = Arrays.asList(38, 27, 43, 3, 9, 82, 10);
        System.out.println(list);
        System.out.println(mergeSort(list));

        LinkedList<Integer> linked = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        long start;
        for (int i = 0; i < 1000; i++) {
            Integer e = ThreadLocalRandom.current().nextInt(20000);
            linked.addLast(e);
            array.add(e);
        }
        System.out.println(mergeSort(linked));
        System.out.println(mergeSort(array));

    }

    public static List<Integer> merge(List<Integer> left, List<Integer> right) {
        int leftSize = left.size();
        int leftIndex = 0;
        int rightSize = right.size();
        int rightIndex = 0;
        List<Integer> merge = new ArrayList<>();

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if (left.get(leftIndex) <= right.get(rightIndex)) {
                merge.add(left.get(leftIndex));
                leftIndex++;
            } else {
                merge.add(right.get(rightIndex));
                rightIndex++;
            }
        }
        while (leftIndex < leftSize) {
            merge.add(left.get(leftIndex));
            leftIndex++;
        }
        while (rightIndex < rightSize) {
            merge.add(right.get(rightIndex));
            rightIndex++;
        }
        return merge;
    }

    public static List<Integer> merge(List<Integer> list, int l, int m, int r) {
        List<Integer> left = list.subList(l, m + 1);
        List<Integer> right = list.subList(m + 1, r + 1);
        List<Integer> merged = merge(left, right);
        for (int i = l; i < r + 1; i++) {
            list.set(i, merged.get(i - l));
        }
        return list;
    }

    public static List<Integer> mergeSort(List<Integer> list, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            list = mergeSort(list, l, m);
            list = mergeSort(list, m + 1, r);
            list = merge(list, l, m, r);
        }
        return list;
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        long start = System.currentTimeMillis();
        list = mergeSort(list, 0, list.size() - 1);
        long end = System.currentTimeMillis();
        System.out.format("Sorted in %d millis \n", end - start);
        return list;
    }
}
