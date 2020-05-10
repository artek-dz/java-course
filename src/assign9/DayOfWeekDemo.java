package assign9;

import javax.sound.midi.Soundbank;
import java.util.EnumSet;

public class DayOfWeekDemo {
    public static void main(String[] args) {

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.getEnglishName() + " is " + (day.isWorkingDay() ? "" : "not ") + "a working day");
            System.out.println(day.getEnglishName() + " is " + (day.isWeekendDay() ? "" : "not ") + "a weekend day");
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day.getPolishName() + (day.isWorkingDay() ? "" : " nie") + " jest dniem roboczym");
            System.out.println(day.getPolishName() + (day.isWeekendDay() ? "" : " nie") + " jest dniem wolnym");
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(DayOfWeek.fromEnglishName(day.getEnglishName()));
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(DayOfWeek.fromPolishName(day.getPolishName()));
        }

        System.out.println(DayOfWeek.getWorkingDays().toString());
        System.out.println(DayOfWeek.getWeekendDays().toString());
    }
}
