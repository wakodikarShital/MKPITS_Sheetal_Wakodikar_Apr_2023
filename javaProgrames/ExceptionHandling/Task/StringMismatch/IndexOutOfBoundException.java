package StringMismatch;

public class IndexOutOfBoundException {


    public static void main(String[] args) {
        String str = "Nagpur";
        try {
            System.out.println(str.charAt(6));
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }


}
