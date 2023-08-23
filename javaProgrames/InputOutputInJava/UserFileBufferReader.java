import java.io.*;

public class UserFileBufferReader {
    public static void main(String[] args) {
            BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enters File Name : ");
            File file = new File(b.readLine());
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str= bufferedReader.readLine();
            System.out.println(str);
        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
