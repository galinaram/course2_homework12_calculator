package hw13.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private final CalculatorService calculatorService = new CalculatorService();
    private final int num1=1;
    private int num2=2;

    @Test
    public void plusTest(){
        int expected = calculatorService.plus(num1,num2);
        int actual = num1+num2;
        assertEquals(expected,actual);
    }
    @Test
    public void minusTest(){
        int expected = calculatorService.minus(num1,num2);
        int actual = num1-num2;
        assertEquals(expected,actual);
    }
    @Test
    public void multiplyTest(){
        int expected = calculatorService.multiply(num1,num2);
        int actual = num1*num2;
        assertEquals(expected,actual);
    }
    @Test
    public void divideTest(){
        double expected = calculatorService.divide(num1,num2);
        double actual = (double) num1 /num2;
        assertEquals(expected,actual);
    }
    @Test
    public void divideExceptionTest(){
        num2=0;
        double expected = calculatorService.divide(num1,num2);
        double actual = (double) num1 /num2;
        assertEquals(expected,actual);
    }
}
