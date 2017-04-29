package examples.sda.personlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2017-04-29.
 */

public class PersonProvider {

    public List<Person> provide() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Andrzej", 20));
        persons.add(new Person("Horacy", 25));
        persons.add(new Person("Adaś", 9));
        persons.add(new Person("Grażyna", 99));
        persons.add(new Person("Irka", 55));
        persons.add(new Person("Szafrian", 69));
        persons.add(new Person("Elojzy", 56));
        persons.add(new Person("Marcin", 78));
        persons.add(new Person("Janush", 23));
        persons.add(new Person("Grześ", 13));
        persons.add(new Person("Stiefan", 19));
        persons.add(new Person("Tobiasz", 45));



        return persons;
    }
}
