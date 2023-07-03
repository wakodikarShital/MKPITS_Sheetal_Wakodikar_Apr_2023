import java.util.List;
import java.util.Scanner;


    public class PasswordVerification {
        public static void main(String[] args) {
            String storedPassword = "Bharat";
            String enteredPassword;

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.print("Enter the password: ");
                enteredPassword = scanner.nextLine();

                if (!enteredPassword.equals(storedPassword)) {
                    System.out.println("Wrong password. Please try again.");

                }
                else {
                    break;
                }
            } while (enteredPassword!=storedPassword);

            System.out.println("Correct password! Access granted.");

        }
    }
//In Java, when comparing strings for equality,
// you should use the equals() method instead of the != operator. The equals() method compares
// the contents of the strings, while the != operator checks if the string references are equal.

