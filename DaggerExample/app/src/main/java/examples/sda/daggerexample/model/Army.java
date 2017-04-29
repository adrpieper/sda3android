package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by szyms on 4/29/17.
 */

public class Army {

    private static final int COST_PER_SOLDIER = 2;
    private static final int PERCENT_OF_ACTIVE_SOLDIERS = 8;
    private final Population population;

    @Inject
    public Army(Population population) {
        this.population = population;
    }

    public int countCost() {
        
        return population.getCount() * PERCENT_OF_ACTIVE_SOLDIERS / 100 * COST_PER_SOLDIER;
    }
}
