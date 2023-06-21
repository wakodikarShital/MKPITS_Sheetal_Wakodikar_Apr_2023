package Overloading;

public class Overloading {
    public void adder(float number1 , double number2){
        System.out.println(number1+number2);

    }

    public static void main(String[] args) {
        Overloading overloading=new Overloading();
        overloading.adder(2,2);
    }
}
