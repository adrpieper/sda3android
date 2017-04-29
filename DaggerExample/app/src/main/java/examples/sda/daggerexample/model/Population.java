package examples.sda.daggerexample.model;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by RENT on 2017-04-29.
 */
@Singleton
public class Population {

    private int count = 1000;
    private static final int TAX_PERCENT = 10;
    @Inject
    public Population() {

    }

    public int getCount(){
        return count;
    }

    public int countTaxes() {

        return getCount()*TAX_PERCENT/100;
    }
}
