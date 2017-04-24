package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static android.R.id.text1;

/**
 * Created by RENT on 2017-04-22.
 */

public class MasterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_master, container, false);

        Button button_basic = (Button) view.findViewById(R.id.button1);
        Button button_detail = (Button) view.findViewById(R.id.button2);

        final MainActivity mainActivity = (MainActivity) getActivity();
        button_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mainActivity.showBasicInfo();
            }
        });

        button_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showDetailInfo();
            }
        });

        return view;

    }




}
