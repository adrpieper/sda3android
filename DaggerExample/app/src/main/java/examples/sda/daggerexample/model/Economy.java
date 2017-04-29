package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Przemysław on 2017-04-29.
 */
@Singleton
public class Economy {
    private final Army army;
    private final Population population;
    private final Building building;

    @Inject
    public Economy(Army army, Population population, Building building) {
        this.army = army;
        this.population = population;
        this.building = building;
    }

    public int countGain() {
        return building.countProduction() + population.countTaxes();
    }

    public int countCost() {
        return building.countCost() + army.countCost();
    }
}
