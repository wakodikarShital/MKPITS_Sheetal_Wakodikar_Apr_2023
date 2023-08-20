package Overloading;

public class Book {
    public static void main(String[]args){
        Shape shape= new Shape();
        System.out.println(shape.book1(12,50));
        System.out.println(shape.book1(12,50,4));

    }
}
class Shape{
    int book1(int a4 ,int a3){
        return a3+a4;
    }

    int book1(int a4 , int a3 , int side){
        return a4 + a3 * a4;
    }
}
