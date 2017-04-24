package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by szyms on 4/24/17.
 */

public class MasterFragment extends Fragment {

    Button button, button2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_master, container, false);

        button = (Button) view.findViewById(R.id.basic_data_button);
        button2 = (Button) view.findViewById(R.id.detail_data_button);

        final MainActivity mainActivity = (MainActivity) getActivity();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity.showBasicData();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mainActivity.showDetailedData();
            }
        });

        return view;
    }


}
