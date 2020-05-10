package assign9;

import java.util.EnumSet;

public enum DayOfWeek {
    MON("Monday", "poniedziałek", true),
    TUE("Tuesday", "wtorek", true),
    WED("Wednesday", "środa", true),
    THU("Thursday", "czwartek", true),
    FRI("Friday", "piątek", true),
    SAT("Saturday", "sobota", false),
    SUN("Sunday", "niedziela", false);

    private String englishName;
    private String polishName;
    private boolean workingDay;

    DayOfWeek(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek day : values()) {
            if (day.getEnglishName().equals(englishName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("\"" + englishName + "\" is not a valid English name of a day.");
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek day : values()) {
            if (day.getPolishName().equals(polishName)) {
                return day;
            }
        }
        throw new IllegalArgumentException("\"" + polishName + "\" is not a valid Polish name of a day.");
    }

    public static EnumSet<DayOfWeek> getWorkingDays() {
        EnumSet<DayOfWeek> workingDays = EnumSet.noneOf(DayOfWeek.class);
        for (DayOfWeek day : values()) {
            if (day.isWorkingDay()) {
                workingDays.add(day);
            }
        }
        return workingDays;
    }

    public static EnumSet<DayOfWeek> getWeekendDays() {
        return EnumSet.complementOf(getWorkingDays());
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public boolean isWeekendDay() {
        return !workingDay;
    }
}
