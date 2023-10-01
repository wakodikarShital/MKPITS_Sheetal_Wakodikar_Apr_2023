import java.util.Scanner;

public class ButtonSystemCondition {
    public  void buttonSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number here = ");
        int button = scanner.nextInt();
        if (button==1){
            System.out.println("Hello");
        } else if (button==2) {
            System.out.println("Namaste");

        } else if (button==3) {
            System.out.println("bonjure");
        }else {
            System.out.println("Invalid button");
        }
    }


}

