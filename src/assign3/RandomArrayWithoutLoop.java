package assign3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayWithoutLoop {
    public static void main(String[] args) {
        int[] random = new int[10];
        Arrays.setAll(random, i -> ThreadLocalRandom.current().nextInt(100));
        System.out.println(Arrays.toString(random));
    }
}
