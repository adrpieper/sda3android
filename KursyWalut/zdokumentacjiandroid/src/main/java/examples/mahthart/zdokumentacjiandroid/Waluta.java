package examples.mahthart.zdokumentacjiandroid;


/**
 * Created by Medard on 2017-05-07.
 */

public class Waluta {
        String nazwaWaluty ;
        String przelicznikWaluty;
        String kodWaluty;
        String kursWaluty;

    public Waluta(String nazwaWaluty, String przelicznikWaluty, String kodWaluty, String kursWaluty) {
        this.nazwaWaluty = nazwaWaluty;
        this.przelicznikWaluty = przelicznikWaluty;
        this.kodWaluty = kodWaluty;
        this.kursWaluty = kursWaluty;
    }
        public Waluta() {}

        public String getNazwaWaluty() {
            return nazwaWaluty;
        }
        public String getPrzelicznikWaluty() {
            return przelicznikWaluty;
        }
        public String getKodWaluty() {
            return kodWaluty;
        }
        public String getKursWaluty() {
            return kursWaluty;
        }
    }