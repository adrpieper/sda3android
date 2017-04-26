package examples.sda.currencycalc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by szyms on 4/25/17.
 */

public class CurrencyCalcFragment extends Fragment {

    private EditText inputField;
    private TextView resultField;
    private CurrencyCalc cc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);
        final MainActivity mainActivity = (MainActivity) getActivity();
        inputField = (EditText) view.findViewById(R.id.input_value_field);
        resultField = (TextView) view.findViewById(R.id.result_text_view);

        inputField.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc();
            }
        });
        return view;
    }

    private void calc() {
        String inputValue = inputField.getText().toString();
        double amount = cc.calc(/*inputValue*/);
        // teraz wyświetl tekst wraz z obliczoną wartością
        resultField.setText("Kwota: " + amount + cc.getOutputCurrency() );
        resultField.setVisibility(View.VISIBLE);

    }
}
