package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Przemysław on 2017-04-29.
 */
@Singleton
public class State {
    private final Economy economy;
    private int gold = 1000;

    @Inject
    public State(Economy economy) {
        this.economy = economy;
    }

    public int getGold() {
        return gold;
    }

    public void countBalance(){
        gold+=economy.countGain();
        gold-=economy.countCost();
    }
}
