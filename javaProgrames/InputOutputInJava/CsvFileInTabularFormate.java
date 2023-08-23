import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileInTabularFormate {
    public void CsvFile(){
        try {
            BufferedReader bufferedReader= new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\quarter,SER_REF,industry_code,indus1.csv"));
            String string=bufferedReader.readLine();
                while(string!=null) {
                    String[] str= string.split(",");
                    for (int counter=0;counter<str.length;counter++) {
                        System.out.print(str[counter] + "\t");
                        string = bufferedReader.readLine();

                    }
                    System.out.println();
                }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        CsvFileInTabularFormate csvFileInTabularFormate = new CsvFileInTabularFormate();
        csvFileInTabularFormate.CsvFile();
    }
}
