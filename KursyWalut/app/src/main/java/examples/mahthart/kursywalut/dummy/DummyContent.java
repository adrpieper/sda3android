package examples.mahthart.kursywalut.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import examples.mahthart.kursywalut.TabelaWalutXML;
import examples.mahthart.kursywalut.Waluta;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {


    /**
     * An array of sample (dummy) items.
     */

    public static ArrayList<TabelaWalutXML> ITEMS = new ArrayList<TabelaWalutXML>();


    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static int COUNT = ITEM_MAP.size();


    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.kodWaluty, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem();
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem extends TabelaWalutXML {

        public String nazwaWaluty;
        String przelicznikWaluty;
        String kodWaluty;
        public String kursWaluty;

//    <nazwa_waluty>dolar Hongkongu</nazwa_waluty>
//    <przelicznik>1</przelicznik>
//    <kod_waluty>HKD</kod_waluty>
//    <kurs_sredni>0,4945</kurs_sredni>

        public DummyItem() {

            this.nazwaWaluty = nazwaWaluty;
            this.kodWaluty = kodWaluty;
            this.przelicznikWaluty = przelicznikWaluty;
            this.kursWaluty = kursWaluty;

        }
    }
}
