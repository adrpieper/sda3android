package examples.mahthart.kolejny1;


/**
 * Created by Medard on 2017-05-07.
 */

public class Waluta {
    private String nazwaWaluty = null ;
    private String kodWaluty = null;
    private String kursWaluty = null;

    public Waluta(String nazwaWaluty, String kodWaluty, String kursWaluty) {
        this.nazwaWaluty = nazwaWaluty;
        this.kodWaluty = kodWaluty;
        this.kursWaluty = kursWaluty;
    }
    public Waluta() {}

    public void setNazwaWaluty(String nazwaWaluty) {
        this.nazwaWaluty = nazwaWaluty;
    }
    public void setKodWaluty(String kodWaluty) {
        this.kodWaluty = kodWaluty;
    }
    public void setKursWaluty(String kursWaluty) {
        this.kursWaluty = kursWaluty;
    }

        public String getNazwaWaluty() {
            return nazwaWaluty;
        }
        public String getKodWaluty() {
            return kodWaluty;
        }
        public String getKursWaluty() {
            return kursWaluty;
        }
    }