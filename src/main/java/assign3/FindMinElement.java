package assign3;

public class FindMinElement {
    public static void main(String[] args) {
        if (args.length > 0) {

            int minimum = Integer.parseInt(args[0]);

            for (int i = 1; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < minimum) {
                    minimum = Integer.parseInt(args[i]);
                }
            }
            System.out.println("Minimum number: " + minimum);
        } else {
            System.out.println("No arguments provided!");
        }
    }
}

