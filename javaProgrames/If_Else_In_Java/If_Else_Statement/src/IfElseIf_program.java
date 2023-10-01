import java.util.Scanner;

public class IfElseIf_program {
    int number1,number2 ;
    public void checkCondition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 = ");
        number1=scanner.nextInt();
        System.out.println("Enter number2 = ");
        number2=scanner.nextInt();


        if(number1==number2){
            System.out.println(number1+ " and "+number2+" both are equal");
        } else if (number1>number2) {
            System.out.println(number1+" is greater than "+number2);
        }else {
            System.out.println(number1+" is less than "+number2);
        }

    }
}
