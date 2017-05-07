package examples.mahthart.useretrofit;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class MainActivity extends AppCompatActivity {

    private ListView listWalut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listWalut = (ListView) findViewById(R.id.waluty_lista);

        String API_BASE_URL = "http://api.nbp.pl/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        retrofit.create(ApiService.class);

        WalutaAdapter walutaAdapter = new WalutaAdapter();
        listWalut.setAdapter(walutaAdapter);
    }

        class WalutaAdapter extends BaseAdapter {
            LayoutInflater layoutInflater;
            ArrayList<Waluta.TabelaKursu> nowaWaluta;

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
                }
                else {
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