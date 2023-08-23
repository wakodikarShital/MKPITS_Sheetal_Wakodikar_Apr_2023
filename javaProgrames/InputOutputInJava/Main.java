import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

//        BufferedInputStream bufferedInputStream = new BufferedInputStream(System.in);
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));// new InputStreamReader(System.in) byte stream to charracter stream convert kara sathi
        System.out.println("Enter name : ");
        try{
            String name=bufferedReader.readLine();
            System.out.println("Hii " + name);
        }catch (IOException e){
            throw  new RuntimeException();
        }

        System.out.println("Calculate square of number : ");
        try{
            String squareOfNumber = bufferedReader.readLine();
            System.out.println("Square of Number : " + Integer.parseInt(squareOfNumber)*Integer.parseInt(squareOfNumber));
        }catch (IOException e){
            throw new RuntimeException();
        }

        System.out.println("Sum of two number");
        try {
            int number1 = Integer.parseInt(bufferedReader.readLine());
            System.out.println(number1+number1);
        }catch (IOException e){
            throw new RuntimeException();
        }

        System.out.println("Even no. or Odd no. of the show : ");

        try{

            int number1 = Integer.parseInt(bufferedReader.readLine());
            if (number1%2==0){
                System.out.println("Even number");

            }else {
                System.out.println("Odd Number");
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Two name are concrete");
        try{
            System.out.println("Enter name1 : ");
            String name= bufferedReader.readLine();
            System.out.println("Enter name2 : ");
            String name1= bufferedReader.readLine();
            System.out.println(name+name1);





        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}