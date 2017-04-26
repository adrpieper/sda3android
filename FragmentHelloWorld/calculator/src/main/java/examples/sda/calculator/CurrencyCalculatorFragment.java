package examples.sda.calculator;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

/**
 * Created by Adrian on 2017-04-25.
 */

public class CurrencyCalculatorFragment extends Fragment {

    private TextView calculatedNumber;


    public HashMap<String, Double> map;
    private Resources resources;
    private Spinner spinner;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);
        TextView textView = (TextView) view.findViewById(R.id.currencyCalculatorText);
        TextView plnTextView = (TextView) view.findViewById(R.id.plnTextView);

        final EditText firstValue = (EditText) view.findViewById(R.id.firstValue);
        calculatedNumber = (TextView) view.findViewById(R.id.calculatedValue);
        Button calculateButton = (Button) view.findViewById(R.id.calculateButton);
        spinner = (Spinner) view.findViewById(R.id.currencySpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.currency, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double numberFromEditText = Double.parseDouble(firstValue.getText().toString());
                    final String calculatedExchangeRate = new Double(calculateExchangeRate(numberFromEditText, spinner.getSelectedItem().toString(), creatingHashMap())).toString();
                    calculatedNumber.setText(calculatedExchangeRate);
                }catch(NumberFormatException e){
                    Toast.makeText(getActivity(), "Type the number pls!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    public double calculateExchangeRate(double firstValue, String currency, HashMap<String, Double> map) {
        String finalCurrency = currency.toLowerCase();
        double actualExchangeRate = map.get(finalCurrency);
        double calculatedValue = firstValue * actualExchangeRate;
        return calculatedValue;
    }

    public HashMap<String, Double> creatingHashMap() {
        resources = this.getResources();
        String[] hashmapData = resources.getStringArray(R.array.hashmapExchangeRates);
        map = new HashMap<String, Double>();
        for (int i = 0; i < hashmapData.length; i = i + 2) {
            map.put(hashmapData[i], Double.parseDouble(hashmapData[i + 1]));
        }
        return map;
    }

}
