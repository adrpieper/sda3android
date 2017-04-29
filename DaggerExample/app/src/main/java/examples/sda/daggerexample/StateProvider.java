package examples.sda.daggerexample;

import examples.sda.daggerexample.model.Army;
import examples.sda.daggerexample.model.Building;
import examples.sda.daggerexample.model.Economy;
import examples.sda.daggerexample.model.Population;
import examples.sda.daggerexample.model.State;

/**
 * Created by Przemysław on 2017-04-29.
 */

public class StateProvider {

    public State provide(){

        Population population = new Population();
        Army army = new Army(population);
        Building building = new Building();
        Economy economy = new Economy(army, population, building);
        return new State(economy);

    }
}
