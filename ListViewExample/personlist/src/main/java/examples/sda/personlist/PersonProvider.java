package examples.sda.personlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Medard on 2017-04-29.
 */

public class PersonProvider {

    ArrayList<Person> ppl;

    public PersonProvider() {

    }

    public List<Person> provider(){
        ppl = new ArrayList<>();

        Person p1 = new Person("Janusz", 21);
        Person p2 = new Person("Janina", 59);
        Person p3 = new Person("Jerzy", 21);
        ppl.add(p1);
        ppl.add(p2);
        ppl.add(p3);
        return ppl;
    }
}
