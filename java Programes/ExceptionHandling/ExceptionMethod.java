import java.util.Scanner;

public class ExceptionMethod {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int num1= sc.nextInt();
        System.out.println("Enter number2");
        int num2= sc.nextInt();
    try {

        System.out.println(num1 / num2);
    }catch (ArithmeticException e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
    catch (Exception e){

        System.out.println("divide by 0");
    }
    finally {
        System.out.println("Divided the " + num1 +  "/" + num2);
    }


    }
}
