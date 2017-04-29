package examples.sda.daggerexample.model;

/**
 * Created by szyms on 4/29/17.
 */

public class StateProvider {

    public static State provide() {

        Building building = new Building();
        Population population = new Population();
        Army army = new Army(population);
        Economy economy = new Economy(building, army, population);
        return new State(economy);
    }
}
