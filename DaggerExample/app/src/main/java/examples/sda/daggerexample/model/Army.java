package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by RENT on 2017-04-29.
 */

public class Army {

    private  final Population population;


    @Inject
    public Army(Population population) {
        this.population = population;
    }


}
