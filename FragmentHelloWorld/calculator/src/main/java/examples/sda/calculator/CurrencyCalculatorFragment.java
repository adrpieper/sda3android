package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CurrencyCalculatorFragment extends Fragment {

    private TextView plnTextView;
    private EditText plnEditText;
    private TextView dolarTextView;
    private EditText dolarEditText;
    private Button calculate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);

        plnTextView = (TextView) view.findViewById(R.id.plnTextView);
        dolarTextView = (TextView) view.findViewById(R.id.dolarTextView);
        plnEditText = (EditText) view.findViewById(R.id.plnEditText);
        dolarEditText = (EditText) view.findViewById(R.id.dolarEditText);
        calculate = (Button) view.findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String dolarString = plnEditText.getText().toString();
                    double dolar = (Double.parseDouble(dolarString)) * 3.876;
                    dolarTextView.setText(dolar + "");

                    Toast.makeText(getActivity(), "Wpisana kwota : " + dolar, Toast.LENGTH_LONG).show();
                } catch (NumberFormatException e) {
                    dolarTextView.setText("0");
                }

                try {
                    String plnString = dolarEditText.getText().toString();
                    double pln = (Double.parseDouble(plnString)) / 3.876;
                    plnTextView.setText(pln + "");
                } catch (NumberFormatException e) {
                    dolarTextView.setText("0");
                }
            }
        });

        return view;
    }
}
