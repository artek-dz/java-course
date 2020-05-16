package assign10.password;

import java.time.LocalDate;

public class UserNameGenerator {
    public String userName(Person person) {
        return (person.getFirstName().substring(0, 1) + person.getLastName()).toLowerCase() +
                (person.getBirthDate().isPresent() ? person.getBirthDate().get().getYear() : LocalDate.now().getYear());
    }
}
