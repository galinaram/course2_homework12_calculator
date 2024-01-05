package hw13.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    public static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
            Arguments.of(1,2, 3),
            Arguments.of(5,6,11),
                Arguments.of(3,5,8)
        );
    }
    public static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(1,2, -1),
                Arguments.of(5,6,-1),
                Arguments.of(5,3,2)
        );
    }
    public static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(1,2,2),
                Arguments.of(5,6,30),
                Arguments.of(5,3,15)
        );
    }
    public static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(2,1,2),
                Arguments.of(5,5,1),
                Arguments.of(6,3,2)
        );
    }
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
    public void divideIllegalArgumentExceptionTest(){
        num2=0;
        double expected = calculatorService.divide(num1,num2);
        double actual = (double) num1 /num2;
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestPlus")
    public void plusParametrized (int num1, int num2, int plus){
        int result = calculatorService.plus(num1, num2);
        Assertions.assertEquals(plus, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestMinus")
    public void minusParametrized (int num1, int num2, int minus){
        int result = calculatorService.minus(num1, num2);
        Assertions.assertEquals(minus, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestMultiply")
    public void multiplyParametrized (int num1, int num2, int multiply){
        int result = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(multiply, result);
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTestDivide")
    public void divideParametrized (int num1, int num2, int divide){
        double result = calculatorService.divide(num1, num2);
        Assertions.assertEquals(divide, result);
    }
}
