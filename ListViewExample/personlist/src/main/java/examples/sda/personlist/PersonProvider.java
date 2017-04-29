package examples.sda.personlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-29.
 */

public class PersonProvider {
    public List<Person> provide(){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", 20));
        persons.add(new Person("Halina", 25));
        return persons;
    }



}
