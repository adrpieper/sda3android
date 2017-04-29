package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by szyms on 4/29/17.
 */

@Singleton
public class Population {

    public static final int TAX_PERCENT = 10;
    private int count = 1000;

    @Inject
    public Population() {
    }

    public int countTaxes() {
        return getCount() * TAX_PERCENT / 100;
    }

    public int getCount() {
        return count;
    }
}
