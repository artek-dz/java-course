package assign7;

import java.util.*;

public class LetterCounter {
    public static void main(String[] args) {
        String testText ="This is a test text";
        System.out.println(letterCounts(testText).toString().replaceAll("\\{|\\}","").replaceAll("=", " - "));
    }

    public static Map<Character,Integer> letterCounts(String text) {
        Map<Character,Integer> counts = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isLetter(character)) {
                if (counts.containsKey(character)) {
                    counts.put(character, counts.get(character) + 1);
                } else {
                    counts.put(character, 1);
                }
            }
        }
        return counts;
    }
}
