package Watches;

public class SmartWatch implements Watches {

    @Override
    public  void typeOfWatch(){
        System.out.println("Smart Watch");

    }
    @Override
    public void brandOfWatch() {
        System.out.println("fastrack brand");
    }

    @Override
    public void shapeOfWatch() {
        System.out.println("rounded");
    }

    @Override
    public void size() {
        System.out.println("size of watch is 35mm");
    }

}
