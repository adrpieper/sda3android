package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Adrian on 2017-04-25.
 */

public class InvestmentFragment extends Fragment {
    InvestmentCalculator investmentCalculator = new InvestmentCalculator();
    private TextView periodOfTimeTextView;
    private EditText amountOfMoneyEditText;
    private Spinner spinner;
    private TextView finalValue;

    public TextView getPeriodOfTimeTextView() {
        return periodOfTimeTextView;
    }

    public EditText getAmountOfMoneyEditText() {
        return amountOfMoneyEditText;
    }

    public Spinner getSpinner() {
        return spinner;
    }

    public TextView getFinalValue() {
        return finalValue;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_investment, container, false);
        final TextView textView = (TextView) view.findViewById(R.id.investmentText);
        amountOfMoneyEditText = (EditText) view.findViewById(R.id.amountOfMoneyEditText);
        periodOfTimeTextView = (TextView) view.findViewById(R.id.periodOfTimeTextView);
        spinner = (Spinner) view.findViewById(R.id.spinner);
        finalValue = (TextView) view.findViewById(R.id.finalValue);
        final Button calculateButton = (Button) view.findViewById(R.id.calculateButton);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(),
                R.array.periodTime, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                investmentCalculator.calculate();
            }
        });



        return view;
    }
}
