package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Przemysław on 2017-04-29.
 */
@Singleton
public class Army {
    private final Population population;
    private static final int COST_PER_SOLDIER = 2;
    private static final int PERCENT_OF_ACTIVE_SOLDIERS = 8;


    @Inject
    public Army(Population population) {
        this.population = population;
    }

    public int countCost() {

        return population.getCount() * PERCENT_OF_ACTIVE_SOLDIERS / 100 * COST_PER_SOLDIER;
    }
}
