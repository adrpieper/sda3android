package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by RENT on 2017-04-29.
 */

public class Population {
    private final Population population;



    @Inject
    public Population(Population population) {
        this.population = population;
    }


}
