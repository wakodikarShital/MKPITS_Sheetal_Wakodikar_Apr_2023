package FindLongestWordFromScanner;

import java.io.*;
import java.util.Scanner;

public class LongestWordFromFileScanner {
    public void findLongestWord(String fileName){
        try {
            String longestWord="";
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()){
                String word= scanner.next();
                if (word.length()>longestWord.length()){
                    longestWord=word;
                }



            }
            System.out.println(longestWord);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void findLongestWordFromScanner(){
        String longestWord="";
        Scanner scanner=new Scanner(System.in);



        while(scanner.hasNext()){
            String fileName =scanner.next();
            if (fileName.length()>longestWord.length()){

                longestWord=fileName;
            }
        }
        System.out.println(longestWord);
    }
}
