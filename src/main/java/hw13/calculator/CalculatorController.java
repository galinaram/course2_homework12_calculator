package hw13.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService = new CalculatorService();

    @RequestMapping()
    public String start () {
        return "Добро пожаловать в калькулятор";
    }
    @RequestMapping("/plus")
    public String plus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + "+" + num2 + "=" + calculatorService.plus(num1,num2);
    }
    @RequestMapping("minus")
    public String minus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + "-" + num2 + "=" + calculatorService.minus(num1,num2);
    }
    @RequestMapping("multiply")
    public String multiply (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1,num2);
    }
    @RequestMapping("divide")
    public String divide (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + "/" + num2 + "=" + calculatorService.divide(num1,num2);
    }
}
