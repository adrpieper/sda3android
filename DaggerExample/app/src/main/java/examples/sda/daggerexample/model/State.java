package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by RENT on 2017-04-29.
 */

public class State {
    private final Economy economy;
    private  int gold = 1000;

    @Inject
    public State(Economy economy) {
        this.economy = economy;
    }

    public  void countBalance(){
        gold += economy.countGain();
        gold += economy.countCost();

    }

    public int

}
