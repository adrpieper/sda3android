package examples.mahthart.dotestowy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listWalut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listWalut = (ListView) findViewById(R.id.waluty_lista);

        WalutaProvider walutaProvider = new WalutaProvider();
        List<Waluta> walutyLista = null;
        try {
            walutyLista = walutaProvider.getWalutyLista();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final WalutaAdapter walutaAdapter = new WalutaAdapter(walutyLista, LayoutInflater.from(this));
        listWalut.setAdapter(walutaAdapter);
    }

    class WalutaAdapter extends BaseAdapter {
        private final LayoutInflater layoutInflater;
        private final List<Waluta> walutyLista;

        public WalutaAdapter(List<Waluta> walutyLista, LayoutInflater layoutInflater) {
            this.walutyLista = walutyLista;
            this.layoutInflater = layoutInflater;
        }

        @Override
        public int getCount() {
            return walutyLista.size();
        }

        @Override
        public Object getItem(int position) {
            return walutyLista.size();
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
