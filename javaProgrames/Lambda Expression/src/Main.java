public class Main {
    public static void main(String[] args) {
       Circle circle = (radius -> {
           System.out.println("Area of circle = "+ radius*radius*3.14);
       });
       circle.circle(8);
    }
}