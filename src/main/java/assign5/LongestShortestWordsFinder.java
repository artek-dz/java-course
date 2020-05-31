package assign5;

import java.util.Arrays;

public class LongestShortestWordsFinder {
    public static void main(String[] args) {
        String sentence = "For given text find the longest and the shortest words";
        String[] words = sentence.split(" ");
        System.out.println("Longest words: " + Arrays.toString(longestWords(words)).replaceAll("\\[|\\]",""));
        System.out.println("Shortest words: " + Arrays.toString(shortestWords(words)).replaceAll("\\[|\\]",""));
    }

    public static String[] longestWords(String[] words) {
        int longest = words[0].length();
        for (String word : words) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }

        int n = 0;
        for (String word : words) {
            if (word.length() == longest) {
                n++;
            }
        }

        String[] longestWords = new String[n];
        int i = 0;
        for (String word : words) {
            if (word.length() == longest) {
                longestWords[i] = word;
                i++;
            }
        }
        return longestWords;
    }

    public static String[] shortestWords(String[] words) {
        int shortest = words[0].length();
        for (String word : words) {
            if (word.length() < shortest) {
                shortest = word.length();
            }
        }

        int n = 0;
        for (String word : words) {
            if (word.length() == shortest) {
                n++;
            }
        }

        String[] shortestWords = new String[n];
        int i = 0;
        for (String word : words) {
            if (word.length() == shortest) {
                shortestWords[i] = word;
                i++;
            }
        }
        return shortestWords;
    }
}
