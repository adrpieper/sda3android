package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RENT on 2017-04-25.
 */

public class ButtonsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_buttons,container,false);
        final MainActivity mainActivity = (MainActivity) getActivity();


        // do przycisku dot. investycji
        view.findViewById(R.id.investment_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showInvestmentForm();

            }
        });


        //do przycisku dot. kalkulatora walut
        view.findViewById(R.id.currency_calculator_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showCurrencyCalculator();
            }
        });


        return view;
    }




}
