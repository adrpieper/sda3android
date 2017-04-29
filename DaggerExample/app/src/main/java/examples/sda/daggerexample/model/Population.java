package examples.sda.daggerexample.model;

/**
 * Created by szyms on 4/29/17.
 */

public class Population {

    public static final int TAX_PERCENT = 10;
    private int count = 1000;

    public int countTaxes() {
        return getCount() * TAX_PERCENT / 100;
    }

    public int getCount() {
        return count;
    }
}
