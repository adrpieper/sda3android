package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adrian on 2017-04-25.
 */

public class ButtonsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_buttons, container, false);

        final MainActivity mainActivity = (MainActivity) getActivity();

        view.findViewById(R.id.investmentButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showInvestmentForm();
            }
        });

        view.findViewById(R.id.currencyCalculatorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showCurrencyCalculator();
            }
        });

        return view;
    }
}
