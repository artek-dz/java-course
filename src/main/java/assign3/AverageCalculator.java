package assign3;

public class AverageCalculator {
    public static void main(String[] args) {
        if (args.length > 0) {
            double sumOfArgs = Double.parseDouble(args[0]);
            for (int i = 1; i < args.length; i++) {
                sumOfArgs = sumOfArgs + Double.parseDouble(args[i]);
            }

            double average = sumOfArgs / args.length;
            System.out.println(average);
        } else {
            System.out.println("No arguments provided!");
        }
    }
}
