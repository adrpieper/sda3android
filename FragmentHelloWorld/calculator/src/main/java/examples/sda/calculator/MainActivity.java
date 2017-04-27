package examples.sda.calculator;

import android.app.Activity;
import android.app.Fragment;
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
        showFragment(new CurrencyCalculatorFragment());
    }

    public void showInvestmentForm() {
        showFragment(new InvestmentFragment());
    }

    public void showAnimationsExamples() {
        showFragment(new AnimationsFragment());
    }

    private void showFragment(Fragment fragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.animator.fragment_in, R.animator.fragment_out);
        transaction.replace(R.id.fragmentFrame, fragment);
        transaction.commit();
    }
}
