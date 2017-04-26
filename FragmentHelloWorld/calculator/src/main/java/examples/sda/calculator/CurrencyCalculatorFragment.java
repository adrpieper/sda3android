package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by Adrian on 2017-04-25.
 */

public class CurrencyCalculatorFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_currency_calculator, container, false);

        amountEditText= (EditText) view.findViewById(R.id.amountEditText);
        view.findViewById(R.id.Button).setOnClickListener((v) -> (calc();));
        return view;



    }
}
