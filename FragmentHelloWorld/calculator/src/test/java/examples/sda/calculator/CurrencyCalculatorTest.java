package examples.sda.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Adrian on 2017-04-26.
 */
public class CurrencyCalculatorTest {

    @Test
    public void calc() throws Exception {
        CurrencyCalculator currencyCalculator = new CurrencyCalculator();
        double result = currencyCalculator.calc(5);

        assert result == 20;
    }

}