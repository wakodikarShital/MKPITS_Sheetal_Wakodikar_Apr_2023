import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public void countLines(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("nameInfo.txt"));
            int noOfLines=0;
            int numberOfWordsInLine=0;
            int numberOfCharacters=0;
           String str = bufferedReader.readLine();
//           str=bufferedReader.readLine();
            while(str!=null){  // line is not null
                noOfLines++;   // increament in number  of lines
                String[] array= str.split(" ");  // creates a array
                numberOfWordsInLine=numberOfWordsInLine+array.length;  // words store in array and count the words
                for (int number=0;number<array.length;number++){
                    numberOfCharacters=numberOfCharacters+array[number].length();   // count the characters
                }

               str=bufferedReader.readLine();

            }
            System.out.println("No. of lines in file : "+  noOfLines);
            System.out.println("No. of words in file : " + numberOfWordsInLine);
            System.out.println("No. of characters in files : " + numberOfCharacters );


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
