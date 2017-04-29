package examples.sda.daggerexample;

import examples.sda.daggerexample.model.Economy;
import examples.sda.daggerexample.model.State;

/**
 * Created by RENT on 2017-04-29.
 */

public class StateProvider {
    public State provide(){

        Economy economy = new Economy(army, building, population);
        return new State(economy);
    }
}
