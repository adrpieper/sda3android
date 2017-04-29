package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Medard on 2017-04-29.
 */
@Singleton
public class Building {
    public int countProduction() {
        return 1000;
    }

    public int countCost() {
        return 100;
    }
    @Inject
    public Building() {

    }
}