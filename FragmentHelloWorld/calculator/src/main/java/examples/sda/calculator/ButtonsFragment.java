package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by RENT on 2017-04-25.
 */

public class ButtonsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_buttons,container,false);

            Button calcButton = (Button) view.findViewById(R.id.calc_button);
            Button investButton = (Button) view.findViewById(R.id.invest_button);

        final MainActivity mainActivity = (MainActivity) getActivity();

        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.openCalc();
            }
        });

        investButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.openInvest();
            }
        });




        return view;
    }
}
