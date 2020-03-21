package assign3;

public class LetterPrinter2 {
    public static void main(String[] args) {
        if (args.length > 0) {
            String letters = args[0];
            for (int i = 0; i < letters.length(); i++) {
                System.out.println(letters.charAt(i));
            }
        } else {
            System.out.println("No argument!");
        }
    }
}
