package examples.sda.currencycalc;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by szyms on 4/25/17.
 */

public class CurrencyCalcFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_currency_calculator, container, false);
        // wyświetl tekst mówiący że tutaj będzie kalkulator walut

//        view.findViewById(R.id.)


        return view;

    }
}
