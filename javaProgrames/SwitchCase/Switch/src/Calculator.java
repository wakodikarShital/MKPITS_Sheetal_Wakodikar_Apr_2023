import java.util.Scanner;

public class Calculator {
    public void calculate(){
        Scanner scanner = new Scanner(System.in);
        int number1,number2,result;
        String operator;
        System.out.println("Enter here operator for calculate two numbers = ");
        operator=scanner.next();
        System.out.println("Enter number1 = ");
        number1=scanner.nextInt();
        System.out.println("Enter number2 = ");
        number2=scanner.nextInt();

        switch (operator){
            case "+":
                result=number1+number2;
                System.out.println(number1+ " + "+ number2 +" = " +result);
                break;
            case "-":
                result=number1-number2;
                System.out.println(number1+ " - "+ number2 +" = " +result);
                break;
            case "*":
                result=number1*number2;
                System.out.println(number1+ " * "+ number2 +" = "+ result);
                break;
            case "/":
                result=number1/number2;
                System.out.println(number1+ " / "+ number2 +" = " +result);
                break;
            case "%":
                result=number1%number2;
                System.out.println(number1+ " % "+ number2 +" = " +result);
        }


    }
}
