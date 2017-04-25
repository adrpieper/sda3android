package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        titleTextView.setText("Podstawowe dane");
        contentTextView.setText("Pawel");
    }    public void showDetailData() {
        titleTextView.setText("Szczegóły");
        contentTextView.setText("Student");
    }}