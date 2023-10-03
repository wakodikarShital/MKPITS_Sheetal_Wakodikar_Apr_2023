import java.util.Scanner;

public class ButtonSystem {
    public void buttonCondition(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number = ");
        number=scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Red button");
                break;
            case 2:
                System.out.println("Green button");
                break;
            case 3:
                System.out.println("Yellow button");
                break;
            default:
                System.out.println("Invalid button");
        }

    }
}
