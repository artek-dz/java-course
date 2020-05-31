package assign10.streams;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private Integer salary;
    private Address address;

    public Person(String firstName, String lastName, LocalDate birthDate, Gender gender, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salary = salary;
        this.address = address;
    }

    public Person(String firstName, String lastName, LocalDate birthDate, String gender, int salary, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = Gender.of(gender);
        this.salary = salary;
        this.address = new Address(city);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == person.salary &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDate, person.birthDate) &&
                gender == person.gender &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, gender, salary, address);
    }

    @Override
    public String toString() {
        return "{'" + firstName
                + " " + lastName
                + "', " + birthDate
                + ", " + gender +
                ", salary=" + salary +
                ", " + address +
                '}';
    }
}
