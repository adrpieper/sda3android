package examples.sda.daggerexample.model;

/**
 * Created by szyms on 4/29/17.
 */

public class Economy {

    private final Building building;
    private final Army army;
    private final Population population;

    public Economy(Building building, Army army, Population population) {
        this.building = building;
        this.army = army;
        this.population = population;
    }
}
