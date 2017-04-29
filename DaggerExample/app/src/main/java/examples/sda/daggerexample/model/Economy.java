package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by szyms on 4/29/17.
 */

@Singleton
public class Economy {

    private final Building building;
    private final Army army;
    private final Population population;

    @Inject
    public Economy(Building building, Army army, Population population) {
        this.building = building;
        this.army = army;
        this.population = population;
    }

    public int countGain() {

        return building.countProduction() + population.countTaxes();
    }

    public int countCost() {

        return building.countCost() + army.countCost();
    }

    /**
     * Udostępnia metydy countCost() i countGain()
     * liczące koszty i przychody na podstawie wartości zwracanych przez klasy Army, Buildings i Population.
     */
}
