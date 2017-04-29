package examples.sda.personlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-29.
 */

public class PersonProvider {

    public List<Person> provide(){
        List<Person> person = new ArrayList<>();
        person.add(new Person("Jan","Kowalski","ywyw@gmail.com", 28));
        person.add(new Person("Rafal", "Kowalski","gajasa@gmail.com",41));
        return person;
    }


}
