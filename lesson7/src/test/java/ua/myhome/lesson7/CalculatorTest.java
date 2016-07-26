package ua.myhome.lesson7;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CalculatorTest {
    /**
     * Тест с таким Ексцепшином безполезен так как ексцепшен переурывает тест
     * @throws UserException
     */
    @Test (expected = UserException.class)
    public void teststartCalculation() throws UserException {
        Calculator calc=new Calculator();
        calc.startCalculation(12,1);
        assertEquals(13.0, calc.getResultSun());
        assertEquals(11.0, calc.getResultMin());
        assertEquals(0.0, calc.getResultMnog());
        assertEquals(0.0, calc.getResultDel());
    }
}