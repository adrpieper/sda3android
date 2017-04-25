package examples.sda.calculator;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Adrian on 2017-04-25.
 */

public class CurrencyCalculatorFragment extends Fragment {

    private TextView calculatedNumber;
    Resources resources = this.getResources();

    private HashMap<String, Double> map;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);
        TextView textView = (TextView) view.findViewById(R.id.currencyCalculatorText);
        TextView plnTextView = (TextView) view.findViewById(R.id.plnTextView);
        TextView euroTextView = (TextView) view.findViewById(R.id.euroTextView);
        final EditText firstValue = (EditText) view.findViewById(R.id.firstValue);
        calculatedNumber = (TextView) view.findViewById(R.id.calculatedValue);
        Button calculateButton = (Button) view.findViewById(R.id.calculateButton);

        creatingHashMap();

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numberFromEditText = Double.parseDouble(firstValue.getText().toString());
                String calculatedExchangeRate = new Double(calculateExchangeRate(numberFromEditText, "euro", map)).toString();
                calculatedNumber.setText(calculatedExchangeRate);
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
        String[] hashmapData = resources.getStringArray(R.array.hashmapExchangeRates);
        map = new HashMap<String, Double>();
        for (int i = 0; i < hashmapData.length; i = i + 2) {
            map.put(hashmapData[i], Double.parseDouble(hashmapData[i + 1]));
        }
        return map;
    }
}
