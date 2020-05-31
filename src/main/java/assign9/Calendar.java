package assign9;

public enum Calendar {
    INSTANCE;

    public static int getDaysInMonth(int year, int month) {
        return month == 2 ? (isLeapYear(year) ? 29 : 28) : (is31DayMonth(month) ? 31 : 30);
    }

    public static int getDaysInYear(int year) {
        return (isLeapYear(year) ? 366 : 365);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isLeapMonth(int year, int month) {
        return (month == 2) && isLeapYear(year);
    }

    public static boolean is31DayMonth(int month) {
        return ((month - 1) % 7) % 2 == 0;
    }
}
