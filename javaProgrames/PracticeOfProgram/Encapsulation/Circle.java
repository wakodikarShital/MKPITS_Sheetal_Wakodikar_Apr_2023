package Encapsulation;

public class Circle {
//    private static double radius = 1;
    private double radius = 1;

    /** Find area of the circle */

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();

        System.out.println("Radius is " + myCircle.radius );
        System.out.println("Area of circle: " + myCircle.getArea());
    }

/** we cannot access the non-static variable in static variable
 * that's why we cannot access directly variable radius in the place of myCircle.radius
 * System.out.println("Radius is " + myCircle.radius ); */


}
