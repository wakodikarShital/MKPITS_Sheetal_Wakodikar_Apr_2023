
import java.io.*;

public class FileReadAndWriteTask {
    public static void fileRead(String file1, String file2) {


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
//            System.out.println("Enters File Name : ");
            File file = new File(file1);
            if (file.exists()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
                String str = bufferedReader.readLine();


                while (str != null) {
                    bufferedWriter.write(str);
                    str = bufferedReader.readLine();
                }
                bufferedWriter.close();
            } else {
                System.out.println("File does not exist");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {


        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Source File");
        try {
            String file1 = b.readLine();
            File file = new File(file1);
            if (file.exists()) {
                System.out.println("Enter target file");
                String file2 = b.readLine();
                FileReadAndWriteTask.fileRead(file1, file2);
                System.out.println("File copied .......");
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


