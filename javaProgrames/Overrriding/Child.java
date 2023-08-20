package Overrriding;

public class Child extends Grandchild {
    @Override
    public void raj(){
        System.out.println("he is playing football");
    }

    public static void main(String[] args) {
        Child child= new Child();
        child.raj();
    }
}
