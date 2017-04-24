package examples.sda.masterdetail;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by RENT on 2017-04-22.
 */

public class MasterFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_master,container,false);

        Button button_podstawowe = (Button) v.findViewById(R.id.button_podstawowe);
        Button button_szczegolowe = (Button) v.findViewById(R.id.button_szczegolowe);

        final MainActivity mainActivity = (MainActivity) getActivity();

        button_podstawowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showMessageBasic();
            }
        });

        button_szczegolowe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showMessageDetail();
            }
        });

        return v;
    }
}
