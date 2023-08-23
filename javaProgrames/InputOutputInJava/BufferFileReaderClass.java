import java.io.*;

public class BufferFileReaderClass {
    public static void main(String[] args) {

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("info.txt"));
            String str= bufferedReader.readLine();
            System.out.println(str);
        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
