package Overloading;

public class Subtraction {
    public static void main(String[]args){
        Substraction1 subtraction1 =new Substraction1();
        System.out.println(subtraction1.sub(10,5));
        System.out.println(subtraction1.sub(20,10));
        System.out.println(subtraction1.sub(30,20,10));

    }
}
class Substraction1{

    int sub(int number1 , int number2){
        return number1-number2;
    }

    int sub(long number1 , int number2){
        return (int)(number1-number2);

    }
    int sub(double number1 , int number2 ,int number3){
        return (int) (number1-number2-number3);
    }

}
