package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Przemysław on 2017-04-29.
 */
@Singleton
public class Population {
    private static final int TAX_PERCENT = 10;
    private int count = 1000;

    public int getCount() {
        return count;
    }

    @Inject
    public Population() {
    }

    public int countTaxes() {
        return getCount() * TAX_PERCENT / 100;
    }
}
