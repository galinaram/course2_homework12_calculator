package hw13.calculator;

public class CalculatorService {
    public int plus (int num1, int num2) {
        return num1+num2;
    }
    public int minus (int num1, int num2) {
        return num1-num2;
    }
    public int multiply (int num1, int num2) {
        return num1*num2;
    }
    public double divide (int num1, int num2) {
        if (num2==0) {
            throw new IllegalArgumentException("делить на ноль нельзя");
        }
        return (double) num1 /num2;
    }
}
