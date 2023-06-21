package Overloading;

public class Division {
    public static void main(String[]args){
        Division1 division1=new Division1();
        System.out.println(division1.div(6,2));
        System.out.println(division1.div(6,3,2));
        System.out.println(division1.div(6,2,2));


    }
}

class Division1{
   public int div(int number1, int number2){
       return number1/number2;
    }
    public int div(long number1 , int number2 ,int number3){
       return (int)(number1/number2/number3);
    }

    public int div(int number1 , int number2 , int number3){
       return number1/number2/number3;
    }
}
