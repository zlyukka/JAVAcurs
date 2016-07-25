package ua.myhome.lesson7;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void teststartCalculation() throws Exception {
        Calculator calc=new Calculator();
        calc.startCalculation(12,6);
        assertEquals(18.0, calc.getResultSun());
        assertEquals(6.0, calc.getResultMin());
        assertEquals(72.0, calc.getResultMnog());
        assertEquals(2.0, calc.getResultDel());
    }

    @Test
    public void testStartCalculation1() throws Exception {

    }
}