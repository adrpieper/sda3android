package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Przemysław on 2017-04-22.
 */

public class MasterFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_master, container, false);

        final MainActivity mainActivity = (MainActivity) getActivity();
        Button basicButton = (Button) view.findViewById(R.id.basicButton);
        Button detailButton = (Button) view.findViewById(R.id.detailButton);

        basicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mainActivity.showBasicInfo();
            }
        });

        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showDetails();
            }
        });

        return view;

    }


}
