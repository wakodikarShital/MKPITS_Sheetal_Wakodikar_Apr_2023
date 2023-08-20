package Overrriding;

public class Miltonbottel extends Bootels {

    @Override
    public void water(){
        System.out.println("This is hot water");
    }

    public static void main(String[] args) {
        Miltonbottel miltonbottel = new Miltonbottel();
        miltonbottel.water();


    }
}
