public class Main {
    public static void main(String[] args) {

        int number1=-6;
        int number2=10;
        int number3=4;


        System.out.println("-----------Maths.abs(number1)------------");
        System.out.println(Math.abs(number1));    // .abs method converted positive into negative

        System.out.println("--------Math.max(int a , int b)----------");
        System.out.println("Maximum value is : " + Math.max(number2,number3));

        System.out.println("--------Math.min(int a , int b)--------");
        System.out.println("Minimum value is  : " + Math.min(number2,number3));

        System.out.println("--------Math.pow(double a , double b)--------");
        System.out.println(Math.pow(2,3));

        System.out.println("--------Math.sqrt(double a )--------");
        System.out.println("Square root of value is  : " + Math.sqrt(16));

        System.out.println("--------Math.sqrt(double a)--------");
        System.out.println("Cube root of value is  : " + Math.sqrt(9));

        System.out.println("--------Math.sqrt(double a)--------");
        System.out.println("Cube root of value is  : " + Math.sqrt(9));

        System.out.println("--------Math.ceil(double a)--------");
        System.out.println( Math.ceil(2.0));
        System.out.println(Math.ceil(2.4));
        System.out.println(Math.ceil(2.99));

        System.out.println("--------Math.floor(double a)--------");
        System.out.println( Math.floor(2.5));
        System.out.println(Math.floor(2.99));
        System.out.println(Math.floor(9.1));

        System.out.println("--------Math.round(double a)--------");
        System.out.println( Math.round(2.05));
        System.out.println(Math.round(2.49));
        System.out.println(Math.round(2.99)); // above 49 it will get the heighest value
        System.out.println(Math.round(2.60));

        System.out.println("--------Math.rint(double a)--------");
        System.out.println(Math.rint(5.1));

        System.out.println("--------Math.round(float a)--------");
        System.out.println(Math.round(5.1));

        System.out.println("--------Math.exp(double a)--------");
        System.out.println(Math.exp(3));

        System.out.println("--------Math.sin(double a)--------");
        System.out.println(Math.sin(30));

        System.out.println("--------Math.cos(double a)--------");
        System.out.println(Math.cos(45));

        System.out.println("--------Math.tan(double a)--------");
        System.out.println(Math.tan(60));

//        System.out.println("--------Math.tan(double a)--------");
//        System.out.println(Math.tan(60));

        System.out.println("--------Math.asin(double a)--------");
        System.out.println(Math.asin(45));

        System.out.println("--------Math.acos(double a)--------");
        System.out.println(Math.acos(60));

        System.out.println("--------Math.atan(double a)--------");
        System.out.println(Math.atan(45));

        System.out.println("--------Math.sinh(double a)--------");
        System.out.println(Math.sinh(30));

        System.out.println("--------Math.cosh(double a)--------");
        System.out.println(Math.cosh(60));

        System.out.println("--------Math.tanh(double a)--------");
        System.out.println(Math.tanh(30));

        System.out.println("--------Math.random(double a)--------");
        System.out.println(Math.random());     // output gives the  0 to 1 between value
















    }
}