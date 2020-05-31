package assign6;

import java.util.*;

public class UniqueSetOfLettersFinder {
    public static void main(String[] args) {
        String testText = "This is a test text.";
        System.out.println(uniqueLetters(testText).toString().replaceAll("\\[|\\]",""));
    }
    public static Set<Character> uniqueLetters(String text) {
        Set<Character> uniqueLetters = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                uniqueLetters.add(ch);
            }
        }
        return uniqueLetters;
    }
}
