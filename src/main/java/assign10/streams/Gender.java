package assign10.streams;

public enum Gender {
    MASCULINE("masculine"),
    FEMININE("feminine"),
    UNDECLARED("undeclared");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public static Gender of(String name) {
        name = name.substring(0, 1).toUpperCase();
        switch (name) {
            case "M":
                return MASCULINE;
            case "F":
                return FEMININE;
            default:
                return UNDECLARED;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
