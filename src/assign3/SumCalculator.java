package assign3;

public class SumCalculator {
    public static void main(String[] args) {
        if (args.length > 0) {
            double sumOfArgs = 0;
            for (String arg : args) {
                sumOfArgs = sumOfArgs + Double.parseDouble(arg);
            }

            System.out.println(sumOfArgs);
        } else {
            System.out.println("No arguments provided!");
        }
    }
}
