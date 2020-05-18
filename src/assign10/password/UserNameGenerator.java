package assign10.password;

import java.time.LocalDate;
import java.util.Optional;

public class UserNameGenerator {
    public String userName(Person person) {
        return (person.getFirstName().charAt(0) + person.getLastName()).toLowerCase() +
                Optional.ofNullable(person.getBirthDate()).orElse(LocalDate.now()).getYear();
    }
}
