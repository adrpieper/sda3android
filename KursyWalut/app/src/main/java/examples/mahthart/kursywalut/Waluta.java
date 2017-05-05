package examples.mahthart.kursywalut;

/**
 * Created by Medard on 2017-05-05.
 */

public class Waluta {

    String nazwaWaluty;
    String przelicznikWaluty;
    String kodWaluty;
    String kursWaluty;

//    <nazwa_waluty>dolar Hongkongu</nazwa_waluty>
//    <przelicznik>1</przelicznik>
//    <kod_waluty>HKD</kod_waluty>
//    <kurs_sredni>0,4945</kurs_sredni>

    public Waluta(String nazwaWaluty, String kodWaluty, String przelicznikWaluty, String kursWaluty) {

        this.nazwaWaluty = nazwaWaluty;
        this.kodWaluty = kodWaluty;
        this.przelicznikWaluty = przelicznikWaluty;
        this.kursWaluty = kursWaluty;
    }
    public Waluta() {}

    public String getKodWaluty() {
        return kodWaluty;
    }

    public void setKodWaluty(String kodWaluty) {
        this.kodWaluty = kodWaluty;
    }

    public String getPrzelicznikWaluty() {
        return przelicznikWaluty;
    }

    public void setPrzelicznikWaluty(String przelicznikWaluty) {
        this.przelicznikWaluty = przelicznikWaluty;
    }

    public String getNazwaWaluty() {
        return nazwaWaluty;
    }

    public void setNazwaWaluty(String nazwaWaluty) {
        this.nazwaWaluty = nazwaWaluty;
    }

    public String getKursWaluty() {
        return kursWaluty;
    }

    public void setKursWaluty(String kursWaluty) {
        this.kursWaluty = kursWaluty;
    }
}
