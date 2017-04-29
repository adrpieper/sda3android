package examples.sda.listviewexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-29.
 */

public class PersonProvider {

    /**
     * poprawne uzywanie klas, ktore maja cos dostarczać
     *
     * @return
     */
    public static List<Person> provideList() {
        List<Person> listPerson = new ArrayList<>();

        listPerson.add(new Person("arek",15));
        listPerson.add(new Person("tomek",19));
        listPerson.add(new Person("basia",16));
        listPerson.add(new Person("jola",25));
        listPerson.add(new Person("bartek",22));
        listPerson.add(new Person("ala",15));

        return listPerson;
    }

}
