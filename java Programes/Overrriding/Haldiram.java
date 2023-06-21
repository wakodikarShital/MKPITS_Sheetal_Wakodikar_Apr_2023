package Overrriding;

public class Haldiram extends Blajisweets {
    @Override
    public void kajukatli(){
        System.out.println("nice test");
    }


    public static void main(String[] args) {
        Haldiram haldiram = new Haldiram();
        haldiram.kajukatli();

    }
}
