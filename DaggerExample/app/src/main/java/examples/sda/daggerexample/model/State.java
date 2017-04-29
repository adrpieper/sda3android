package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by szyms on 4/29/17.
 */

public class State {

    private final Economy economy;
    private int gold = 1000;

    @Inject
    public State(Economy economy) {
        this.economy = economy;
    }

    /**
     * Udostępnia metodę countBalance(), która odejmuje od skarbca koszty,
     * a dodaje przychody zwracane przed klasę economy
     */
    public void countBalance() {

        gold += economy.countGain();
        gold -= economy.countCost();
    }

    public int getGold() {
        return gold;
    }
}
