package Overloading;

public class Multiplication {
    static int multiply1(int num1,int num2){
        return num1*num2;

    }

    static int multiply1(int num1 ,int num2 ,int num3){
        return num1*num2*num3;
    }

    static  float multiply1(int num1 ,float num2){
       return (float) (num1*num2);
    }

}
