package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

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

        final View button = view.findViewById(R.id.currencyCalculatorButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.showCurrencyCalculator();
                Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.example_animation);
                button.startAnimation(animation);
            }
        });




        return view;
    }
}
