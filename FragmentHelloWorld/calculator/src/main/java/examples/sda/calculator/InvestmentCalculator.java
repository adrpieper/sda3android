package examples.sda.calculator;

/**
 * Created by Przemysław on 2017-04-26.
 */

public class InvestmentCalculator {
    InvestmentFragment investmentFragment = new InvestmentFragment();


    public void calculate() {
        double amountOfMoney = Double.parseDouble(investmentFragment.getAmountOfMoneyEditText().toString());


    }
}
