package examples.sda.mycalculator;

/**
 * Created by LenovoM on 2017-04-26.
 */

public class InvestmentCalculator {

    public double calculateInvestment(double kwota, double procent, double lata) {
        double wynik = 0;
        for (int i = 0; i <= lata; i++) {
            wynik += kwota * (procent / 100);
        }
        return wynik;
    }
}
