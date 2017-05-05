package examples.mahthart.kurswalut;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Medard on 2017-05-05.
 */

public class WalutaProvieder {
    public List<WalutaContent> provide() {
        List<WalutaContent> waluty = new ArrayList<>();
        waluty.add(new WalutaContent("USD", 20));
        waluty.add(new WalutaContent("CHF", 25));
        waluty.add(new WalutaContent("EURO", 9));
        waluty.add(new WalutaContent("Dominik", 24));
        return waluty;
    }
}
