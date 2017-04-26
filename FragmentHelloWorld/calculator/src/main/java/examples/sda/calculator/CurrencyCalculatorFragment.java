package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


public class CurrencyCalculatorFragment extends Fragment {

    private EditText amountEditText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);
        amountEditText = (EditText) view.findViewById(R.id.amountEditText);
        view.findViewById(R.id.calcButton).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                calc();
            }

            private void calc() {
                try {
                    String amountString = amountEditText.getText().toString();
                    double amount = Double.parseDouble(amountString);
                    Toast.makeText(getActivity(), "Wpisana kwota : " + amount, Toast.LENGTH_LONG).show();
                } catch (NumberFormatException e) {
                    Toast.makeText(getActivity(), "Proszę wpisać liczbę: ", Toast.LENGTH_LONG).show();
                }
            }

        });
        return view;
    }

}
