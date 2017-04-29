package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Adrian on 2017-04-25.
 */

public class CurrencyCalculatorFragment extends Fragment {
    private EditText edit_exchange;
    private TextView text_exchanged_cash;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_currency_calculator, container, false);
        edit_exchange = (EditText) v.findViewById(R.id.edit_cash_to_exchange);
        text_exchanged_cash = (TextView) v.findViewById(R.id.Text_exchange_cash);

        v.findViewById(R.id.exchange_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String cash = edit_exchange.getText().toString();
                    double amount = Integer.parseInt(cash);
                    amount = amount / 3.14;

                    text_exchanged_cash.setText(getString(R.string.you_have) + String.format("%.2f",amount) +" USD");

                }catch(NumberFormatException e){
                    Toast.makeText(getActivity(), R.string.please_type_digit, Toast.LENGTH_SHORT).show();
                }

            }
        });
        return v;
    }
}
