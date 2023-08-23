import java.io.*;

public class FileNameUsingArgumentConstructor {
    public void readFromFile(String file1){
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enters File Name : ");
            File file = new File(file1);
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


    public static void main(String[] args) {
        FileNameUsingArgumentConstructor fileNameArgument = new FileNameUsingArgumentConstructor();
        fileNameArgument.readFromFile("nameInfo.txt");
    }
}
