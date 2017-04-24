package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by LenovoM on 2017-04-22.
 */

public class DetailFragment extends Fragment {
    private TextView title;
    private TextView data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmet_detail, container, false);
        title = (TextView) view.findViewById(R.id.title);
        data = (TextView) view.findViewById(R.id.data);
        return view;
    }

    public void showBasicData() {
        title.setText("Basic data");
        data.setText("Wyswietlanie danych podstawowych");
    }

    public void showDetailsData() {
        title.setText("Details data");
        data.setText("Wyswietlanie danych szczegolowych");
    }
}
