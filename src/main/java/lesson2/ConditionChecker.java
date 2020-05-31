package lesson2;

public class ConditionChecker {
    public static void main(String[] args) {
        if (true) {
            System.out.println("This line is always printed.");
        }

        if (5==3){
            System.out.println("This line will not be printed.");
        }

        String text = "IT-Academy";
        if (text.contains("-")){
            System.out.println(text + " contains -.");
        }

        int number = 15;
        if (number >=10) {
            System.out.println("Number at least 10");
        } else {
            System.out.println("Number less than 10");
        }

        double temp = 60.5;
        if (temp>90) {
            System.out.println("Shut down PC");
        } else if (temp > 60) {
            System.out.println("Run cooler fan on high speed");
        } else if (temp > 35) {
            System.out.println("Run cooler fan on low speed");
        } else {
            System.out.println("Switch off fan");
        }

        double airTemperature = 25.1;
        String weatherCondition =  airTemperature > 19 ? "warm" : "cold";
        System.out.println("It's" + weatherCondition + " today");
        String weatherCondition2="";
                if( airTemperature > 19) {
                    weatherCondition2="warm";
                } else {
                    weatherCondition2 ="cold";
                }
        System.out.println("It's" + weatherCondition2 + " today");

                boolean isWhite=false;
                boolean isWithBackSupport = true;
                boolean isRead=false;
                if (isWhite && isWithBackSupport) {
                    System.out.println("We buy it");
                } else {
                    System.out.println("We don't buy it");
                }
                boolean isBiedronkaCloses = false;
                if (!isBiedronkaCloses) {
                    System.out.println("We buy toilet paper");
                }

    }
}
