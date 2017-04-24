package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by RENT on 2017-04-22.
 */

public class DetailFragment extends Fragment {

    private TextView title;
    private TextView desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_detail,container,false);


        title = (TextView) view.findViewById(R.id.title);
        desc = (TextView) view.findViewById(R.id.description);

        final MainActivity mainActivity = (MainActivity) getActivity();


        return view;
    }

    public void showBasicInfo() {
        title.setText("Podstawowe dane");

    }

    public void showDetailInfo() {
        desc.setText("Opis");

    }
}
