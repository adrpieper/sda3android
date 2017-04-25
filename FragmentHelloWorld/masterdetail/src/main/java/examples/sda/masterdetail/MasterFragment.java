package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by LenovoM on 2017-04-22.
 */

public class MasterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_master, container, false);
        Button basicButton = (Button) view.findViewById(R.id.basicButton);
        Button detailsButton = (Button) view.findViewById(R.id.detailsButton);
        final MainActivity mainActivity = (MainActivity) getActivity();

        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showBasicData();
            }
        });
        detailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showDetailsData();
            }
        });

        return view;
    }
}
