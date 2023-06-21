package Overloading;

public class House {
    public static void main(String[]args){
        Area area1= new Area();
        System.out.println(area1.area(4,10));
        System.out.println(area1.area(4,6));
        System.out.println(area1.area(15,15,15));

    }
}
  class Area{

    long area(long sides , long height){
        return sides*height;
    }
    long area(int radius , long breath){
        return radius * breath;
    }
    long area (int side , int side1 ,int side2 ){
       return side*side1*side2;
    }
}