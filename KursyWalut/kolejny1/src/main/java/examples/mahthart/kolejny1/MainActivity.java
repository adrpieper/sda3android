package examples.mahthart.kolejny1;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listWalut = null;
    private String streamFileString = null;
    private InputStream in = null;
    private List <Waluta> walutyLista = null;
    private WalutaAdapter walutaAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listWalut = (ListView) findViewById(R.id.waluty_lista);

        WebServiceHandler webServiceHandler = new WebServiceHandler();
        webServiceHandler.execute("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
        walutaAdapter= new WalutaAdapter(walutyLista, LayoutInflater.from(this));
    }

    private class WebServiceHandler extends AsyncTask<String, Void, String> {

        private ProgressDialog dialog = new ProgressDialog(MainActivity.this);

        @Override
        protected void onPreExecute() {

            dialog.setMessage("Czekaj...");
            dialog.show();
        }

        @Override
        protected String doInBackground(String... urls) {

            try {
                // zakładamy, że jest tylko jeden URL
                URL url = new URL(urls[0]);
                URLConnection connection = url.openConnection();

                in = new BufferedInputStream(connection.getInputStream());

                streamFileString = in.toString();
                return streamFileString ;

            } catch (Exception e) {

                Log.d(MainActivity.class.getSimpleName(), e.toString());
                return null;
            }
        }

        @Override
        protected void onPostExecute(String result) {

            dialog.dismiss();
            try {
                readJsonStream(in);
            } catch (IOException e) {
                e.printStackTrace();
            }

            listWalut.setAdapter(walutaAdapter);
        }


        public List<Waluta> readJsonStream(InputStream is) throws IOException {
            JsonReader reader = new JsonReader(new InputStreamReader(is, "UTF-8"));
            try {
                return getWalutyLista(reader);
            } finally {
                reader.close();
            }
        }

        public List<Waluta> getWalutyLista(JsonReader reader) throws IOException {
            walutyLista = new ArrayList<>();

            reader.beginArray();
            while (reader.hasNext()) {
                walutyLista.add(readWaluta(reader));
            }
            reader.endArray();
            return walutyLista;
        }

        public Waluta readWaluta(JsonReader reader) throws IOException {
            Waluta walutka = new Waluta();

            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                if (name.equals("currency")) {
                    walutka.setNazwaWaluty(reader.nextString());
                } else if (name.equals("code")) {
                    walutka.setKodWaluty(reader.nextString());
                } else if (name.equals("mid")) {
                    walutka.setKursWaluty(reader.nextString());
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();
            return walutka;
        }
    }
    class WalutaAdapter extends BaseAdapter {
        private final LayoutInflater layoutInflater;

        public WalutaAdapter(List<Waluta> walutyLista, LayoutInflater layoutInflater) {

            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            return walutyLista.size();
        }

        @Override
        public Object getItem(int position) {
            return walutyLista.get(position);
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
            TextView kodWalutyX = (TextView) walutaView.findViewById(R.id.kod_waluty);
            TextView kursWalutyX = (TextView) walutaView.findViewById(R.id.kurs_waluty);

            Waluta waluta = (Waluta) getItem(position);
            nazwaWalutyX.setText(waluta.getNazwaWaluty());
            kodWalutyX.setText(waluta.getKodWaluty());
            kursWalutyX.setText(waluta.getKursWaluty());
            return walutaView;
        }
    }
}