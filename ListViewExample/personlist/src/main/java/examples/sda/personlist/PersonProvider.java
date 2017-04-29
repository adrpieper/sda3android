package examples.sda.personlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-29.
 */

public class PersonProvider {
    private List<Person> personList;

    public PersonProvider(){
        personList = new ArrayList<>();
    }
    public void add(Person person){
        personList.add(person);

    }

    public void setUp(){
    Person person = new Person ("Rafał", "Strzyz", "rwo@wp.pl", 32)
    }

}
