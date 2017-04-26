package examples.sda.mycalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LenovoM on 2017-04-25.
 */

public class InvestmentFragment extends Fragment {
    private double kwota;
    private double lata;
    private double procent;
    private double wynik;
    private EditText procentEditText;
    private EditText lataEditText;
    private EditText kwotaEditText;
    private TextView wynikTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_investment, container, false);
        procentEditText = (EditText) view.findViewById(R.id.procent);
        lataEditText = (EditText) view.findViewById(R.id.lata);
        kwotaEditText = (EditText) view.findViewById(R.id.kwotaLokaty);
        wynikTextView = (TextView) view.findViewById(R.id.wynik);
        final Button obliczLokateButton = (Button) view.findViewById(R.id.lokataButton);
        obliczLokateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
                InvestmentCalculator myCalc = new InvestmentCalculator();
                wynik = myCalc.calculateInvestment(kwota,procent,lata);
                wynikTextView.setText(String.valueOf(wynik));
            }
        });

        return view;
    }

    private void getValues() {
        try {
            kwota = Double.valueOf(kwotaEditText.getText().toString());
            lata = Double.valueOf(lataEditText.getText().toString());
            procent = Double.valueOf(procentEditText.getText().toString());

        } catch (NumberFormatException e) {
            Toast.makeText(getActivity(), "Prosze wpisac odpowiednia wartosc", Toast.LENGTH_SHORT).show();
        }

    }

}
