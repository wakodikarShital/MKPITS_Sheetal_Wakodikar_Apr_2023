import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        String str= new String("http://www.abc.com");
        System.out.println(str.substring(0,11));
//        Scanner scanner = new Scanner(System.in);
//        str=scanner.next();
        if (str.equals("http://www.abc.com")){
            if (str.substring(11).contains(".")){
                System.out.println("Valid website Name");
            }
                else {
                System.out.println("invalid Website Name");
            }
        }else {


            System.out.println("Invalid Website Name");
        }

    }
}
