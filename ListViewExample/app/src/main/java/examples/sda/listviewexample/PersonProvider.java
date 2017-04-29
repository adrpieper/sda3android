package examples.sda.listviewexample;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-04-29.
 */

public class PersonProvider {



    private ArrayList<Person> listOfPeople;

    public void setListOfPeople(ArrayList<Person> listOfPeople) {
        this.listOfPeople = listOfPeople;
    }

    public PersonProvider() {
        this.listOfPeople = new ArrayList<>();

    }

    public ArrayList<Person> getListOfPeople() {
        return listOfPeople;
    }

    public void provide(){


        listOfPeople.add(new Person("Monika",19));
        listOfPeople.add(new Person("Andrzej",23));
        listOfPeople.add(new Person("Eliza",25));
        listOfPeople.add(new Person("Maciek",22));
        listOfPeople.add(new Person("Piotr",21));
        listOfPeople.add(new Person("Patrycja",27));
        listOfPeople.add(new Person("Agata",22));
        listOfPeople.add(new Person("Nikola",17));
        listOfPeople.add(new Person("Kuba",26));
        listOfPeople.add(new Person("Krzysiek",26));
        listOfPeople.add(new Person("Ewelina",19));








    }









}
