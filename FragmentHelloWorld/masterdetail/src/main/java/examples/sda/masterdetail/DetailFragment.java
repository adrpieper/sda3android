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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      final View v = inflater.inflate(R.layout.fragment_detail,container,false);
        textView = (TextView) v.findViewById(R.id.textView);
        return v;
    }

    public void showBasicData() {
       textView.setText("Opis podstawowy");
    }

    public void showDetailData(){
        textView.setText("Opis szczegoloewy");
    }

}
