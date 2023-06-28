import java.util.Scanner;

public class StarPatternMain {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Case name :");
            String string = scanner.nextLine();
            System.out.println("Enter a number for design print :");
            int number = scanner.nextInt();

            StarPatternService service = new StarPatternService();
            service.patternCalculate(string, number);
        }
    }

