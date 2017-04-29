package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by RENT on 2017-04-29.
 */

public class Building {
    private final Building building;


    @Inject
    public Building(Building building) {
        this.building = building;
    }



}
