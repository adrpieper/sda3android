package examples.mahthart.useretrofit;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Medard on 2017-05-07.
 */
@Root(name="pozycja")
public class Waluta {

    @Root(name = "tabela_kursow")
    class TabelaKursu extends Waluta{
        public TabelaKursu() {
        }
        @ElementList(inline = true)
        List<Waluta>waluty;
        public TabelaKursu(List<Waluta> waluty) {
            this.waluty = waluty;
        }
        public List<Waluta> getConfigurations() {
            if (waluty == null) {
                waluty = new ArrayList<Waluta>();
                waluty.add(new Waluta(nazwaWaluty, przelicznikWaluty, kodWaluty ,kursWaluty));
            }
            return this.waluty;
        }
        public void setConfigurations(List<Waluta> configuration) {
            this.waluty = configuration;
        }
    }
    @Element(name = "nazwa_waluty")
    private String nazwaWaluty;
    @Element(name = "przelicznik")
    private String przelicznikWaluty;
    @Element(name = "kod_walut")
    private String kodWaluty;
    @Element(name = "kurs_sredni")
    private String kursWaluty;

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