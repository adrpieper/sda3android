package examples.sda.daggerexample;


import examples.sda.daggerexample.model.Army;
import examples.sda.daggerexample.model.Building;
import examples.sda.daggerexample.model.Economy;
import examples.sda.daggerexample.model.Population;
import examples.sda.daggerexample.model.State;

public class StateProvider {

    public static State provide() {
        Population population = new Population();
        Building building = new Building();
        Army army = new Army(population);
        Economy economy = new Economy(army,building,population);
        return new State(economy);
    }
}
