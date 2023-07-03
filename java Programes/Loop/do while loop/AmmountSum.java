import java.util.Scanner;

public class AmmountSum {

    public static void main(String[] args) {
        int amount=0;
        int count = 0;
        int amtsum =0;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter the amount");
            amount = sc.nextInt();


            if(amount>0){


                amtsum = amount+amtsum;
                count++;
            }
            else {
                System.out.println("Enter amount more than zero");
            }



        } while (amtsum < 100);

        System.out.println("Number of times the amount was entered: " + count);
        System.out.println("sum"+amtsum);
    }
}