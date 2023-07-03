import java.util.Scanner;

public class PinNumber {


    public static void main(String[] args) {

        int pin = 1;

        int pinvalue =1234;

        Scanner sc = new Scanner(System.in);

        while ( pin<=3){

            System.out.println("Enetr the pinnumber "+pin+" times");
            pinvalue = sc.nextInt();

            pin++;
        }
        System.out.println("Exit the code enter pin again");
    }



}
