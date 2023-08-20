import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

    int sum =0;

        for(int num=1;num<=10;num++){

            Scanner sc = new Scanner(System.in);


            System.out.println("Enter the "+num+"number");
            num = sc.nextInt();

            sum = sum + num;


        }
        System.out.println("Addition of num is "+sum);

    }
}
