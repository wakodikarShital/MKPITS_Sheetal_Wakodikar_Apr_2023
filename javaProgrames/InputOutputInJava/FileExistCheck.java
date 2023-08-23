import java.io.*;

public class FileExistCheck {
    public static void main(String[] args) {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enters File Name : ");
            File file = new File(b.readLine());
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String str = bufferedReader.readLine();
                while(str!=null) {
                    System.out.println(str);
                    str=bufferedReader.readLine();
                }
            }else {
                System.out.println("File does not exist");
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
