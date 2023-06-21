package Overloading;

public class Multiply {
    public static void main(String[]args){

        Multiplication multiplication = new Multiplication();

        System.out.println(multiplication.multiply1(4,5));
        System.out.println(multiplication.multiply1(4,4.0f));
        System.out.println(multiplication.multiply1(1,2,3));
    }
}
