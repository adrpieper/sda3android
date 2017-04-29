package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Medard on 2017-04-29.
 */
@Singleton
public class Economy {
    private final Army army;
    private final Building building;
    private final Population population;

    @Inject
    public Economy(Army army, Building building, Population population) {
        this.army = army;
        this.building = building;
        this.population = population;
    }

    public int countGain() {
        return building.countProduction() + population.countTaxes();
    }

    public int countCost() {
        return building.countCost() + army.countCost();
    }
}
