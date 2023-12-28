package hw13.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
//public static class CalculatorServiceTestConstants{
//    public final int num1 = 1;
//    public int num2 = 2;
//
//}
//public static Stream<Arguments> provideParamsForTest() {
//    return Stream.of(
//            Arguments.of(1,2)
//    );
//}
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
    public void divideIllegalArgumentExceptionTest(){
        num2=0;
        double expected = calculatorService.divide(num1,num2);
        double actual = (double) num1 /num2;
        assertEquals(expected,actual);
    }
//    @ParameterizedTest
//    @MethodSource("provideParamsForTest")
//    public void shouldGenerateCorrectMessage (int num1, int num2){
//
//    }
}
