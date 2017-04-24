package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Przemysław on 2017-04-22.
 */

public class DetailFragment extends Fragment {

    private TextView titleTextView;
    private TextView detailTextView;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_detail,container,false);
        titleTextView = (TextView) view.findViewById(R.id.TitleTextView);
        detailTextView = (TextView) view.findViewById(R.id.detailTextView);
        showBasicInfo();
        return view;

    }


    public void showBasicInfo() {
        titleTextView.setText("Przemek");
        detailTextView.setText("Przemek ma 28 lat");
    }

    public void showDetails() {
        titleTextView.setText("Przemek");
        detailTextView.setText("Przemek Ostrouch ma 28 lat i jest git");
    }
}
