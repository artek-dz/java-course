package lesson2;

public class LoopDemo {
    public static void main(String[] args) {
        System.out.println("WHILE LOOP:");
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("DO..WHILE LOOP:");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        System.out.println("CLASSIC FOR LOOP (FOR WITH COUNTER):");
        for (int k = 0; k >= -5; k--) {
            System.out.println(k);
        }

        System.out.println("Days of week:");
        String[] daysOfWeek = {"M", "T", "W", "T", "F", "S", "S"};
        for (int k = 0; k < daysOfWeek.length; k++) {
            System.out.println(daysOfWeek[k]);
        }

    }
}