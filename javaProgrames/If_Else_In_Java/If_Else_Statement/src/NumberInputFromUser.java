import java.util.Scanner;

public class NumberInputFromUser {




        public  void getInputFromUser(){
            System.out.println("Enter Number = ");
            Scanner scanner = new Scanner(System.in);
            int number=scanner.nextInt();
            if (number==10){
                System.out.println("Number = " +number +" is Equal");
            }else {
                System.out.println("Not equal");
            }
        }
}
