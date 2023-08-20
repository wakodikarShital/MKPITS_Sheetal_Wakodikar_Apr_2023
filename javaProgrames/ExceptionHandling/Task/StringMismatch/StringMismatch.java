package StringMismatch;

public class StringMismatch {
    String str1="shital";
    String str2="Shital";


    public void display() throws UserDefineException{
        if (str1!=str2)
            throw new UserDefineException();


    }


    public static void main(String[] args) {
        StringMismatch stringMismatch = new StringMismatch();
        try {
            stringMismatch.display();
        }catch (UserDefineException e){
            System.out.println(e.getMessage());
        }


    }



}
