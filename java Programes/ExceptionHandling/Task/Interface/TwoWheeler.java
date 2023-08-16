package Interface;

public class TwoWheeler extends Car implements Motorbike,Cycle  {

    @Override
    public void methodSpeed() {
        System.out.println("Speed of motor bike 90km/Hr");
    }

    @Override
    public void methodDistance() {
        System.out.println("distance  50 meter of Cycle");
    }

    @Override
    public void display() {
        System.out.println("Marcedes");
    }

    public static void main(String[] args) {
        TwoWheeler twoWheeler= new TwoWheeler();
        twoWheeler.display();
        twoWheeler.methodDistance();
        twoWheeler.methodSpeed();

    }
}
