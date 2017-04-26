package examples.sda.currencycalc;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCurrencyCalculator();

    }

    public void showCurrencyCalculator() {

        final FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentFrame, new CurrencyCalcFragment());
        fragmentTransaction.commit();
    }

    public void showInvestmentForm() {

        final FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentFrame, new InvestmentFragment());
        fragmentTransaction.commit();
    }
}
