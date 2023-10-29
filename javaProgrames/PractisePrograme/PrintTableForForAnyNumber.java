import java.util.Scanner;

public class PrintTableForForAnyNumber {
        public void tableForAnyNumber (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number = ");
            int N = scanner.nextInt();
            for(int counter=1;counter<11;counter++){
                System.out.println(N + " x "+counter+" = " +N*counter);

            }
        }
}


