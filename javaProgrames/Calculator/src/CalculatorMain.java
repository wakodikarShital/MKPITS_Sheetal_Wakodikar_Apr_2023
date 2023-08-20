import Calculator.CalculateService;

public class CalculatorMain{
    public static void main(String[] args) {
        CalculateService calculateService=new CalculateService();

        calculateService.calculate("+",10.0,10.1);

        calculateService.calculate("-",10.0,5.1);

        calculateService.calculate("*",10.1,10.2);

        calculateService.calculate("/",15.1,3.0);



    }
}