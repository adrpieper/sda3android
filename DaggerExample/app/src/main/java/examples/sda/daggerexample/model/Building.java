package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by szyms on 4/29/17.
 */

@Singleton
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
