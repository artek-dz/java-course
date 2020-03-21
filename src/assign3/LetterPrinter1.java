package assign3;

public class LetterPrinter1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            char[] letters = args[0].toCharArray();
            for (int i = 0; i < letters.length; i++) {
                System.out.println(letters[i]);
            }
        } else {
            System.out.println("No argument!");
        }
    }
}
