import java.util.Scanner;

public class IntegerWcClass {
    public static void main(String[] args) {
        int num;
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num =scanner.nextInt();
        System.out.println("Enter Number2 : ");
        num1= scanner.nextInt();
        System.out.println("Hexadecimal Equivalent of "  + num  + " = "  +  Integer.toHexString(num));
        System.out.println("Octal Equivalent of "  + num  +   " = "  +  Integer.toOctalString(num));
        System.out.println("Binary Equivalent of "  + num  +  " = "  +  Integer.toBinaryString(num));
        System.out.println("sum of " + num1 + " + " + num  +  " = "  +  Integer.sum(num,num1));
        System.out.println("Compare the num and num1 = " + Integer.compare(num,num1));
        System.out.println(Integer.valueOf(2));


        System.out.println("Enter String ");
        String str = new String(scanner.next());
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        if (str.equals(stringBuffer.toString()))
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");

        StringBuffer stringBuffer1 = new StringBuffer("Nagpur&Maharashtra");
        System.out.println(stringBuffer.replace(5,6," "));












    }
}
