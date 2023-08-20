package Overloading;

public class Laibrary {
    public static void main(String[] args) {

        Laibrary laibrary = new Laibrary();

        System.out.println(laibrary.books(2,3,6));
        System.out.println(laibrary.books(5,5));
        System.out.println(laibrary.books(5,10));



    }

    public long books(long shape , long size , long height){
        return shape+size+height;

    }

    public double books( double length ,double breadth ){
        return length*breadth;

    }

    public int books( int length , int breadth){
        return length*breadth;

    }



}
