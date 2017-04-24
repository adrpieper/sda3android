package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Adrian on 2017-04-22.
 */

public class MasterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master, container, false);
        Button basicDataButton = (Button) view.findViewById(R.id.basicDataButton);
        Button detailDataButton = (Button) view.findViewById(R.id.detailDataButton);
        final MainActivity mainActivity = (MainActivity) getActivity();
        basicDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showBasicData();
            }
        });
        detailDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showDetailData();
            }
        });

        return view;
    }
}
