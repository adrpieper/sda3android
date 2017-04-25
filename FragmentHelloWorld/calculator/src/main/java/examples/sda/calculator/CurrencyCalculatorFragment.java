package examples.sda.calculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by RENT on 2017-04-25.
 */

public class CurrencyCalculatorFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_currency_calculator,container,false);

        final EditText pln = (EditText) view.findViewById(R.id.text_pln);
        final TextView usd = (TextView) view.findViewById(R.id.text_usd);


        view.findViewById(R.id.count_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String after = "" + Integer.parseInt(pln.getText().toString())* 3.14;
                usd.setText(after);

            }
        });







        return view;
    }




}
