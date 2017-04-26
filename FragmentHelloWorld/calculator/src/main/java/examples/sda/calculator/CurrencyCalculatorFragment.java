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


    private void calc(){
        String amountString = amountEditText.getText().toString();
        try{
            double amount = Double.parseDouble(amountString);
            Toast.makeText(getActivity()), "Wpisana kwota po przeliczeniu : " + calculator.calc(amount);

        }catch (NumberFormatException e) {
            Toast.
        }
    }
}
