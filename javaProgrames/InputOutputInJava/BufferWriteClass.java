import java.io.*;

public class BufferWriteClass {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("nameInfo.txt"));
            System.out.println("Enter some info : ");
            String name = bufferedReader.readLine();
            bufferedWriter.write(name);
            bufferedWriter.close();


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Info.txt"));
            System.out.println("Enter some info : ");
            String name = bufferedReader.readLine();
            while (true){
                if(name.equals("end"))
                break;
                bufferedWriter.write(name + "\n");
                name=bufferedReader.readLine();

            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
