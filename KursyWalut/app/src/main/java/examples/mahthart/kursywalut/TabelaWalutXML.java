package examples.mahthart.kursywalut;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Medard on 2017-05-05.
 */

public class TabelaWalutXML extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waluta_list);

        XmlPullParserFactory pullParserFactory;

        try {
            pullParserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = pullParserFactory.newPullParser();

            InputStream in_s = getApplicationContext().getAssets().open("lasta.xml");
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in_s, null);

            parseXML(parser);

        } catch (XmlPullParserException e) {

            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void parseXML(XmlPullParser parser) throws XmlPullParserException,IOException
    {
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

        printWaluty(pozycje);
    }


    void printWaluty( ArrayList<Waluta> pozycje)
    {
        String content = "";
        Iterator<Waluta> it = pozycje.iterator();
        while(it.hasNext())
        {
            Waluta currProduct  = it.next();
            content = content + "Waluta :" +  currProduct.nazwaWaluty + "n";
            content = content + "Kod :" +  currProduct.kodWaluty + "n";
            content = content + "Przelicznik :" +  currProduct.przelicznikWaluty + "n";
            content = content + "Kurs :" +  currProduct.kursWaluty + "n";

        }

        TextView display = (TextView)findViewById(R.id.info);
        display.setText(content);
    }
}
