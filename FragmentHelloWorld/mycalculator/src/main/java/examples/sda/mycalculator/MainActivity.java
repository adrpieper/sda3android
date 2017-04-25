package examples.sda.mycalculator;

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
        final FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrame, new CurrencyCalculatorFragment());
        transaction.commit();
    }

    public void showInvestmentForm() {
        final FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentFrame, new InvestmentFragment());
        transaction.commit();
    }
}
