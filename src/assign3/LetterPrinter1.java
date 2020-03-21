package assign3;

public class LetterPrinter1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            char[] letters = args[0].toCharArray();
            for (char letter : letters) {
                System.out.println(letter);
            }
        } else {
            System.out.println("No argument!");
        }
    }
}
