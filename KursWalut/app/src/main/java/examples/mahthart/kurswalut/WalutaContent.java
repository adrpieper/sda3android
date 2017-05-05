package examples.mahthart.kurswalut;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import examples.mahthart.kurswalut.BR;

public class WalutaContent extends BaseObservable {

        private String waluta;
        private int kurs;

    public WalutaContent() {}

    public WalutaContent(String waluta, int kurs) {
        this.waluta = waluta;
        this.kurs = kurs;
    }

    public void setWaluta(String waluta) {
        this.waluta = waluta;
        notifyPropertyChanged(BR.waluta);
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
        notifyPropertyChanged(BR.kurs);
    }

    @Bindable
    public String getWaluta() {
        return waluta;
    }
    @Bindable
    public int getKurs() {
        return kurs;
    }
//    /**
//     * An array of sample (dummy) items.
//     */
//    public static final List<WalutaContent> ITEMS = new ArrayList<WalutaContent>();
//
//    /**
//     * A map of sample (dummy) items, by ID.
//     */
//    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
//
//    private static final int COUNT = 25;
//
//    static {
//        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createDummyItem(i));
//        }
//    }
//
//    private static void addItem(DummyItem item) {
//        ITEMS.add(item);
//        ITEM_MAP.put(item.id, item);
//    }
//
//    private static DummyItem createDummyItem(int position) {
//        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
//    }
//
//    private static String makeDetails(int position) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Details about Item: ").append(position);
//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
//        return builder.toString();
//    }
//
//    /**
//     * A dummy item representing a piece of content.
//     */
//    public static class DummyItem {
//        public final String id;
//        public final String content;
//        public final String details;
//
//        public DummyItem(String id, String content, String details) {
//            this.id = id;
//            this.content = content;
//            this.details = details;
//        }
//
//        @Override
//        public String toString() {
//            return content;
//        }
//    }
}
