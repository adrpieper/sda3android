package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**ne
 * Created by Adrian on 2017-04-22.
 */

public class DetailFragment extends Fragment {

    private TextView titleTextView;
    private TextView contentTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_detail, container, false);
        titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        contentTextView = (TextView) view.findViewById(R.id.contentTextView);
        return view;
    }

    public void showBasicData() {
        titleTextView.setText(R.string.basic_data);
        contentTextView.setText("Adrian Pieper");
    }

    public void showDetailData() {
        titleTextView.setText(R.string.detail_data);
        contentTextView.setText("Trener SDA");
    }
}
