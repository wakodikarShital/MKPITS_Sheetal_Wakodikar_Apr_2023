import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {

        String storedPassword = "Shital";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password : ");

        String enterPassword;
        enterPassword = sc.nextLine();

        if(enterPassword.equals(storedPassword)){



            System.out.println("Correct Password ! Access Granted");
        }else {
            System.out.println("Incorrect Password");
        }

    }



}
