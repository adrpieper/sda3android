package examples.sda.currencycalc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by szyms on 4/25/17.
 */

public class ButtonsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_buttons, container, false);
        final MainActivity mainActivity = (MainActivity) getActivity();

        view.findViewById(R.id.invest_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showInvestmentForm();
            }
        });

        view.findViewById(R.id.calc_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showCurrencyCalculator();
            }
        });

        view.findViewById(R.id.animate_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showAnimations();
            }
        });

        return view;
    }
}
