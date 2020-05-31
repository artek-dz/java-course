package assign6;

import java.util.*;

public class UniqueListOfLettersFinder {
    public static void main(String[] args) {
        String testText = "This is a test text.";
        System.out.println(uniqueLetters(testText).toString().replaceAll("\\[|\\]",""));
    }

    public static List<Character> uniqueLetters(String text) {
        List<Character> uniqueLetters = new LinkedList<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch) && !uniqueLetters.contains(ch)) {
                uniqueLetters.add(ch);
            }
        }
        return uniqueLetters;
    }
}

