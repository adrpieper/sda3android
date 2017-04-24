package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static examples.sda.masterdetail.R.id.button_one;
import static examples.sda.masterdetail.R.id.button_one;
import static examples.sda.masterdetail.R.id.button_two;

/**
 * Created by Adrian on 2017-04-22.
 */

public class MasterFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState) {
        final View view = inflater.inflate(R.layout.fragment_master, container, false);
        Button button_one = (Button) view.findViewById(R.id.button_one);
        Button button_two = (Button) view.findViewById(R.id.button_two);
        final MainActivity mainActivity = (MainActivity) getActivity();
        button_one.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                mainActivity.showBasicData();
            }
        });
        button_two.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {
                mainActivity.showDetailData();
            }
        });

        return view;
    }
}
