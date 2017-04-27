package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Adrian on 2017-04-25.
 */

public class CurrencyCalculatorFragment extends Fragment {

    private EditText amountEditText;
    private CurrencyCalculator calculator = new CurrencyCalculator();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);

        amountEditText = (EditText) view.findViewById(R.id.amountEditText);
        view.findViewById(R.id.calcButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
        return view;
    }

    private void calc() {
        try {
            String amountString = amountEditText.getText().toString();
            double amount = Double.parseDouble(amountString);
            Toast.makeText(getActivity(), "Wpisana kwota po przeliczeniu : " + calculator.calc(amount), Toast.LENGTH_LONG).show();
        }catch (NumberFormatException e) {
            Toast.makeText(getActivity(), "Proszę wpisac liczbe", Toast.LENGTH_LONG).show();
        }
    }
}
