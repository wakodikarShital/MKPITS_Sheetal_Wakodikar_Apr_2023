package Overrriding;

public class Car extends Vehical {
    public void run(){
        System.out.println("car is nexon");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run();

    }
}
