package Overrriding;

public class Flat1 extends House {
    @Override
    public void design(){
        System.out.println("its a 2bhk");
    }

    public static void main(String[] args) {
        Flat1 flat1= new Flat1();
        flat1.design();

    }
}
