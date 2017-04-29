package examples.sda.daggerexample.model;

/**
 * Created by Adrian on 2017-04-29.
 */

public class Economy {
    private final Army army;
    private final Building building;
    private final Population population;

    public Economy(Army army, Building building, Population population) {
        this.army = army;
        this.building = building;
        this.population = population;
    }
}
