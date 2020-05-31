package assign9;

import java.time.Month;

public class CalendarDemo {

    public static void main(String[] args) {

        int year = 1904;
        for (int month = 1; month < 13; month++) {

            System.out.println(Month.of(month) + " " + Calendar.INSTANCE.getDaysInMonth(year, month));
        }

        Calendar.INSTANCE.getDaysInYear(year);

    }
}
