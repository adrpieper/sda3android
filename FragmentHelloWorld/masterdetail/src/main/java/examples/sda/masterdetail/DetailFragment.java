package examples.sda.masterdetail;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by RENT on 2017-04-22.
 */

public class DetailFragment extends Fragment {

    private TextView textView;
    private TextView titleTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      final View v = inflater.inflate(R.layout.fragment_detail,container,false);
        textView = (TextView) v.findViewById(R.id.textView);
        titleTextView = (TextView) v.findViewById(R.id.textView2);
        return v;
    }

    public void showBasicData() {
       titleTextView.setText("Podstawowe");
      textView.setText("Opis podstawowy");

    }

    public void showDetailData(){
        titleTextView.setText("Szczegółowe");
       textView.setText("Opis szczegoloewy");

    }

}
