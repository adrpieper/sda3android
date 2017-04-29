package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by szyms on 4/29/17.
 */

public class Building {

    @Inject
    public Building() {
    }

    public int countProduction() {

        return 1000;
    }

    public int countCost() {

        return 100;
    }
}
