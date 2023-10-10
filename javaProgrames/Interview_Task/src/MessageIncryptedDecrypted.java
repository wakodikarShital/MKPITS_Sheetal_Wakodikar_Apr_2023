import java.util.Arrays;
import java.util.Scanner;

public class MessageIncryptedDecrypted {
    Scanner scanner = new Scanner(System.in);
    public void messageIncrypted() {
        System.out.println("Enter the String = ");
        String message = scanner.next();

        for (int counter = 0; counter < message.length(); counter++) {
            int ch = message.charAt(counter);
            System.out.print((ch) + "-");

        }

    }
}







