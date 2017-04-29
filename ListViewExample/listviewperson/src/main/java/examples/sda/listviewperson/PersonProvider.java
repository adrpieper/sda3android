package examples.sda.listviewperson;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Przemysław on 2017-04-29.
 */

public class PersonProvider {



    private Resources resources;
    private List<Person> personList;

    public PersonProvider(Resources resources) {
        this.resources = resources;
    }

    public List<Person> createPerson() {

        personList = new ArrayList<>();
        for (int i = 0; i < resources.getStringArray(R.array.names).length; i++) {
            Person person = new Person(resources.getStringArray(R.array.names)[i],
                    resources.getStringArray(R.array.surnames)[i], resources.getIntArray(R.array.ages)[i]);
            personList.add(i, person);
        }
        return personList;
    }

}
