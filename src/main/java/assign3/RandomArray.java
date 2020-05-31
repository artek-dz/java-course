package assign3;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArray {
    public static void main(String[] args) {
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i]= ThreadLocalRandom.current().nextInt(100);
        }
        System.out.println(Arrays.toString(random));
    }
}
