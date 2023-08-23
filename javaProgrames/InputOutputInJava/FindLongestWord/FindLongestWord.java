package FindLongestWord;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindLongestWord {
    public void longestWord(){
        String longestWord="";

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader("nameInfo.txt"));
            String string = bufferedReader.readLine();
            while (string!=null){
                String[]array=string.split(" ");
                for (int number=0;number< array.length;number++){
                    if (array[number].length() > longestWord.length())  
                        longestWord = array[number];
                    string=bufferedReader.readLine();

                }

            }

            System.out.println("Longest word in file = "+longestWord);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
