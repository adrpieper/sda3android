package examples.sda.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by RENT on 2017-04-29.
 */

public class Population {

    private static final int TAX_PERCENT = 10;
    private int count = 1000;

    public int countTaxes() {
        return getCount() * TAX_PERCENT / 100;
    }

    public int getCount() {
        return count;
    }
}

