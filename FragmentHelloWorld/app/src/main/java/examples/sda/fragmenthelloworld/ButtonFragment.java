package examples.sda.fragmenthelloworld;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by RENT on 2017-04-22.
 */

public class ButtonFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.single_button_activity, container, false);
        Button button = (Button) view.findViewById(R.id.button);


        final MainActivity mainActivity = (MainActivity) getActivity();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showMessage();
            }
        });

        return view;
    }







}
