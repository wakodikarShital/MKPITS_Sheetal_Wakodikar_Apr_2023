package Overrriding;

public class Travellbag extends Bag {

    @Override
    public void type(){
        System.out.println("This is travelling bag");
    }

    public static void main(String[] args) {
        Travellbag travellbag = new Travellbag();
        travellbag.type();
    }

}
