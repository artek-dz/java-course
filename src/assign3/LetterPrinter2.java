package assign3;

import java.util.Arrays;

public class LetterPrinter2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String letters = args[0];
            int[] indexes = new int[letters.length()];
            Arrays.setAll(indexes, index -> index);
            for (int index : indexes) {
                System.out.println(letters.charAt(index));
            }
        } else {
            System.out.println("No argument!");
        }
    }
}

