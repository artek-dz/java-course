package assign6;

import java.util.*;

public class UniqueLetterFinder {
    public static void main(String[] args) {
        String testText = "This is a test text.";
        System.out.println(uniqueLetters(testText).toString().replaceAll("\\[|\\]",""));
        System.out.println(uniqueLetters1(testText).toString().replaceAll("\\[|\\]",""));
        System.out.println(uniqueLetters2(testText).toString().replaceAll("\\[|\\]",""));

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

    public static Set<Character> uniqueLetters1(String text) {
        Set<Character> uniqueLetters = new TreeSet<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                uniqueLetters.add(ch);
            }
        }
        return uniqueLetters;
    }

    public static Set<Character> uniqueLetters2(String text) {
        Set<Character> uniqueLetters = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(text.charAt(i))) {
                uniqueLetters.add(text.charAt(i));
            }
        }
        return uniqueLetters;
    }

    public static List<Character> uniqueLetters0(String text) {
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

