package assign10.password;

import java.time.LocalDate;

public class UserNameGeneratorTester {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", LocalDate.parse("1999-01-01"));
        System.out.println(new UserNameGenerator().userName(person1));

        Person person2 = new Person("Ola", "Nowak");
        System.out.println(new UserNameGenerator().userName(person2));
    }
}
