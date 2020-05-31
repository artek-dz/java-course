package assign6;

import javax.swing.*;
import java.util.*;

public class ListComparison {

    public static void main(String[] args) {
        arrayListTest(100_000);
        linkedListTest(100_000);

    }
    private static void arrayListTest (int iterations) {
        long loopStartTime;
        long loopExecutionTime;

        List<Integer> arrayList = new ArrayList<>();
        loopStartTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(0,i);
        }
        loopExecutionTime = System.currentTimeMillis() - loopStartTime;
        System.out.printf("Adding %d elements to an array list, execution time = %d millis \n", iterations, loopExecutionTime);

        loopStartTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            arrayList.get(i);
        }
        loopExecutionTime = System.currentTimeMillis() - loopStartTime;
        System.out.printf("Getting elements from an array list of %d elements, execution time = %d millis \n", iterations, loopExecutionTime);

    }

    private static void linkedListTest(int iterations) {
        long loopStartTime;
        long loopExecutionTime;
        List<Integer> linkedList = new LinkedList<>();
        loopStartTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(0,i);
        }
        loopExecutionTime = System.currentTimeMillis() - loopStartTime;
        System.out.printf("Adding %d elements to an array list, execution time = %d millis \n", iterations, loopExecutionTime);

        loopStartTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedList.get(i);
        }
        loopExecutionTime = System.currentTimeMillis() - loopStartTime;
        System.out.printf("Getting elements from a linked list of %d elements, execution time = %d millis \n", iterations, loopExecutionTime);
    }


}
