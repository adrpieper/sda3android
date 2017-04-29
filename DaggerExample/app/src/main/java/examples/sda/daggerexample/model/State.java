package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by RENT on 2017-04-29.
 */

public class State {
    private final Economy economy;


    @Inject
    public State(Economy economy) {
        this.economy = economy;
    }



}
