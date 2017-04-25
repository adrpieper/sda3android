package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Adrian on 2017-04-22.
 */

public class DetailFragment extends Fragment {

    protected TextView textView;
    protected TextView textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        textView = (TextView) view.findViewById(R.id.textView);
        textView2 = (TextView) view.findViewById(R.id.textView2);

        return view;
    }

    public void showBasicData() {

        textView.setText("Jan Kowalski 25");
        textView2.setText("Gdańsk ul. Partyzantów 122/1A");

    }

    public void showDetailData() {

        textView.setText("Politechnika Gdańska");
        textView2.setText("Oceanotechnika. Budowa jachtów.");
    }

    public String[] getDetailData() {

        String[] name = new String[2];

        name[0] = textView.getText().toString();
        name[1] = textView2.getText().toString();
        return name;
    }
}
