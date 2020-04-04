package assign5;

import java.time.LocalDate;
import java.time.Year;

public class Student extends Person {
    private String faculty;
    private Year graduationYear;

    public Student(String firstName, String lastName, LocalDate birthDate, String faculty, Year graduationYear) {
        super(firstName, lastName, birthDate);
        this.faculty = faculty;
        this.graduationYear = graduationYear;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Year getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Year graduationYear) {
        this.graduationYear = graduationYear;
    }
}
