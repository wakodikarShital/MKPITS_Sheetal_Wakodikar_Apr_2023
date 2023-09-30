import java.util.Scanner;

public class CheckOddAndEven {
    public void oddAndEven(){
        System.out.println("Enter Number = ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        if (number%2==0){
            System.out.println("Number = " +number +" is Even number");
        }else {
            System.out.println("Number = " +number +" is Odd Number");
        }

    }
}
