package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by szyms on 4/24/17.
 */

public class DetailFragment extends Fragment {

    private TextView titleTextView;
    private TextView detailTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_detail, container, false);
        titleTextView = (TextView) view.findViewById(R.id.textView);
        detailTextView = (TextView) view.findViewById(R.id.textView2);
        return view;
    }


    public void showBasicData() {

        titleTextView.setText("Basic data");
        detailTextView.setText("A header");
    }

    public void showDetailedData() {

        titleTextView.setText("Detailed data");
        detailTextView.setText("More info below the header");
    }
}
