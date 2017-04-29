package examples.sda.personlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-04-29.
 */

public class PersonProvider {

    public List<Person> provide() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Janusz", 80));
        persons.add(new Person("Halina", 55));
        persons.add(new Person("Grażyna", 15));
        persons.add(new Person("Bożydar", 45));
        return persons;
    }
}
