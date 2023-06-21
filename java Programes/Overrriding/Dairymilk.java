package Overrriding;

public class Dairymilk extends Chocklate {
    @Override
    public void ingriedient(){
        System.out.println("It is in nuts");
    }

    public static void main(String[] args) {
        Dairymilk dairymilk = new Dairymilk();
        dairymilk.ingriedient();
    }
}
