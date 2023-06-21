package Overloading;

public class Additions {
    public static void main(String[]args){
    Additions additions= new Additions();
        System.out.println(additions.add(5,5));
        System.out.println(additions.add(5,5,5));


    }

   public long add(int number1 , int number2 ){
        return number1+number2;

   }
   public long add(int number1 ,int number2 , int number3){
        return number1+number2+number3;
   }

}
