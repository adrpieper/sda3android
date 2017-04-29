package examples.sda.personlist;

import java.util.ArrayList;

/**
 * Created by szyms on 4/29/17.
 */

public class PersonProvider {

/*
    private ArrayList<Person> people = this.provide();

    public PersonProvider(ArrayList<Person> people) {
        this.people = people;
    }
*/

    public ArrayList<Person> provide() {

        ArrayList<Person> ppl = new ArrayList<>();

        Person p1 = new Person("Janusz", "Kurczak", 21);
        Person p2 = new Person("Janina", "Szczota", 59);
        Person p3 = new Person("Jerzy", "Kiler", 25);
        ppl.add(p1);
        ppl.add(p2);
        ppl.add(p3);
        return ppl;
    }
}
