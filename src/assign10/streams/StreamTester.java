package assign10.streams;

import java.text.Collator;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTester {
    public static void main(String[] args) {

        Person person0 = new Person(
                "Alicja",
                "Majewska",
                LocalDate.parse("1956-01-01"),
                "f",
                9000, "Warszawa");

        Person person1 = new Person(
                "Jan",
                "Kowalski",
                LocalDate.parse("1990-01-01"),
                "m",
                8000, "Krakow");

        Person person2 = new Person(
                "John",
                "Smith",
                LocalDate.parse("1945-04-01"),
                "m",
                10000, "New York");

        Person person3 = new Person(
                "Marcin",
                "Bielański",
                LocalDate.parse("1997-04-01"),
                "m",
                10000, "Krakow");

        Person person4 = new Person(
                "Alicia",
                "Kendrick",
                LocalDate.parse("2006-09-01"),
                "f",
                100, "Krakow");

        Person person5 = new Person(
                "Zosia",
                "Bednarska",
                LocalDate.parse("2007-08-01"),
                "f",
                600, "London");

        Person person6 = new Person(
                "Marek",
                "Sierocki",
                LocalDate.parse("2014-09-01"),
                "m",
                5000, "Krakow");

        List<Person> persons = List.of(person0, person1, person2, person3, person4, person5, person6);
//  4. Using streams and lambda functions (or method references) create new lists with:
//      - all men under 65 years
//      - all women with salary less than 5000
//      - all persons younger than 18 years from Krakow
//      - all persons who are not from Krakow
//        during streaming try to sort lists by firstName, or lastName, or birthDay
//        try to sort in reverse order
//        hint: use stream, filter, predicate, sort, collect, collector

        List<Person> menUnder65 = List.copyOf(persons).stream()
                .filter(p -> p.getGender().equals(Gender.MASCULINE))
                .filter(p -> p.getBirthDate().isAfter(LocalDate.now().minusYears(65)))
                .sorted((p0, p1) -> p0.getLastName().compareTo(person1.getLastName()))
                .collect(Collectors.toList());
        System.out.println(menUnder65);

        List<Person> women5000 = List.copyOf(persons).stream()
                .filter(p -> p.getGender().equals(Gender.FEMININE))
                .filter(p -> p.getSalary() < 5000)
                .sorted((p0, p1) -> Collator.getInstance().compare(p0.getFirstName(), p1.getFirstName()))
                .collect(Collectors.toList());
        System.out.println(women5000);

        List<Person> youngFromKrakow = List.copyOf(persons).stream()
                .filter(p -> p.getAddress().getCity().equals("Krakow"))
                .filter(p -> p.getBirthDate().isAfter(LocalDate.now().minusYears(18)))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
        System.out.println(youngFromKrakow);

        List<Person> notFromKrakow = List.copyOf(persons).stream()
                .filter(p -> !(p.getAddress().getCity().equals("Krakow")))
                .sorted(Comparator.comparing(Person::getBirthDate).reversed())
                .collect(Collectors.toList());
        System.out.println(notFromKrakow);

//        5. Using streams and lambda functions find:
//        - average salary
//        - number of women in Krakow
//        - number of men after 65 years
//        - oldest person
//        - youngest person from Krakow
//        - total salary
//        hint: use map, count, max, min, reduce

        OptionalDouble average0 = List.copyOf(persons).stream()
                .mapToInt(p -> p.getSalary())
                .average();

        System.out.println(average0);

        Double average1 = List.copyOf(persons).stream()
                .collect(Collectors.averagingInt(Person::getSalary));
        System.out.println(average1);

        long womenInKrakowCount = List.copyOf(persons).stream()
                .filter(p -> p.getAddress().getCity().equals("Krakow"))
                .filter(p -> p.getGender().equals(Gender.FEMININE))
                .count();

        System.out.println(womenInKrakowCount);

        long menAfter65 = List.copyOf(persons).stream()
                .filter(p -> p.getBirthDate().isBefore(LocalDate.now().minusYears(65)))
                .filter(p -> p.getGender().equals(Gender.MASCULINE))
                .count();

        System.out.println(menAfter65);

        Optional<Person> oldestPerson = List.copyOf(persons).stream()
                .min(Comparator.comparing(Person::getBirthDate));
        System.out.println(oldestPerson);

        Optional<Person> youngestFromKrakow = List.copyOf(persons).stream()
                .filter(p -> (p.getAddress().getCity().equals("Krakow")))
                .max(Comparator.comparing(Person::getBirthDate));
        System.out.println(youngestFromKrakow);

        Integer sum0 = List.copyOf(persons).stream()
                .mapToInt(p -> p.getSalary())
                .reduce(0, (int0, int1) -> int0 + int1);
        System.out.println(sum0);

        Integer sum1 = List.copyOf(persons).stream()
                .mapToInt(p -> p.getSalary())
                .sum();
        System.out.println(sum1);

        Integer sum2 = List.copyOf(persons).stream()
                .collect(Collectors.summingInt(Person::getSalary));
        System.out.println(sum2);

//        6. Using streams on new collections from P4 check:
//        - does any person has first letter 'A' in firstName
//        - does all persons contains letter 'a' in lastName
//        hint: use anyMatch, allMatch

        Boolean containsA = women5000.stream()
                .anyMatch(p -> p.getFirstName().substring(0, 1).equals("A"));
        System.out.println(containsA);


        Boolean allWithA = youngFromKrakow.stream()
                .allMatch(p -> p.getLastName().contains("a"));
        System.out.println(allWithA);
    }
}
