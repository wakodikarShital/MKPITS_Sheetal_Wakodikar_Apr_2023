package StringMismatch;

public class NumberFormatException {
    public static void main(String[] args) {

        String str1="123"; // we take a number in string so it converted into int

        System.out.println(Integer.parseInt(str1));

        String str2="abc"; //
        try {
            System.out.println(Integer.parseInt(str2));  // we take a string so it will not convert into integer throw numberFormateException
        }catch (Exception e){
            System.out.println(e.getMessage());
        }






    }
}
