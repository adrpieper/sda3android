package examples.mahthart.zdokumentacjiandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listWalut;
    private URL url = null;
    private URI uri = null;
    private XmlPullParserFactory pullParserFactory;
    private XmlPullParser parser;

    public MainActivity() throws URISyntaxException, IOException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listWalut = (ListView) findViewById(R.id.waluty_lista);

        WalutaAdapter walutaAdapter = new WalutaAdapter();
        listWalut.setAdapter(walutaAdapter);

            try {
                uri = new URI("http://api.nbp.pl/api/exchangerates/tables/a/");
                url = uri.toURL();
                InputStream in = url.openStream();
                pullParserFactory = XmlPullParserFactory.newInstance();
                parser = pullParserFactory.newPullParser();
                parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
                parser.setInput(in, null);
                parseXML(parser);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }

    private void parseXML(XmlPullParser parser) throws XmlPullParserException,IOException {

        ArrayList<Waluta> pozycje = null;
        int eventType = parser.getEventType();
        Waluta currentWaluta = null;

        while (eventType != XmlPullParser.END_DOCUMENT){
            String name = null;
            switch (eventType){
                case XmlPullParser.START_DOCUMENT:
                    pozycje = new ArrayList();
                    break;
                case XmlPullParser.START_TAG:
                    name = parser.getName();
                    if (name == "pozycja"){
                        currentWaluta = new Waluta();
                    } else if (currentWaluta != null){
                        if (name == "nazwa_waluty"){
                            currentWaluta.nazwaWaluty = parser.nextText();
                        } else if (name == "przelicznik"){
                            currentWaluta.przelicznikWaluty = parser.nextText();
                        } else if (name == "kod_waluty"){
                            currentWaluta.kodWaluty= parser.nextText();
                        } else if (name == "kurs_sredni"){
                            currentWaluta.kursWaluty= parser.nextText();
                        }
                    }
                    break;
                case XmlPullParser.END_TAG:
                    name = parser.getName();
                    if (name.equalsIgnoreCase("pozycja") && currentWaluta != null){
                        pozycje.add(currentWaluta);
                    }
            }
            eventType = parser.next();
        }
    }

    class WalutaAdapter extends BaseAdapter {
        LayoutInflater layoutInflater;
        ArrayList<Waluta> nowaWaluta;

        @Override
        public int getCount() {
            return nowaWaluta.size();
        }

        @Override
        public Waluta getItem(int position) {
            return nowaWaluta.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View walutaView;
            if (convertView == null) {
                walutaView = layoutInflater.inflate(R.layout.waluta_item, parent, false);
            } else {
                walutaView = convertView;
            }
            TextView nazwaWalutyX = (TextView) walutaView.findViewById(R.id.nazwa_waluty);
            TextView przelicznikWalutyX = (TextView) walutaView.findViewById(R.id.przelicznik_waluty);
            TextView kodWalutyX = (TextView) walutaView.findViewById(R.id.kod_waluty);
            TextView kursWalutyX = (TextView) walutaView.findViewById(R.id.kurs_waluty);

            Waluta waluta = getItem(position);
            nazwaWalutyX.setText(waluta.getNazwaWaluty());
            przelicznikWalutyX.setText(waluta.getPrzelicznikWaluty());
            kodWalutyX.setText(waluta.getKodWaluty());
            kursWalutyX.setText(waluta.getKursWaluty());
            return walutaView;
        }
    }
}
