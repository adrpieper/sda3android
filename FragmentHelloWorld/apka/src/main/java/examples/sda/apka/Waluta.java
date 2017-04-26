package examples.sda.apka;

/**
 * Created by Medard on 2017-04-26.
 */

public enum Waluta {
    USD(2.5),
    CHF(3.5),
    EURO(4.5);

    double waluta;
    Waluta(double w) {
        waluta = w;
    }
}
