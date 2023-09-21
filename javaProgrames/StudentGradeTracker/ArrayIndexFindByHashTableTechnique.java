package employeepayrollsystem;

import java.util.Scanner;

public class ArrayIndexFindByHashTableTechnique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //initialize array of 10 size
        int []number=new int[10];
        int value;

        //find index of the value by hashtable technique
        for (int counter=0;counter<number.length;counter++){

            System.out.println("Enter the " + counter+ " value = ");
             value=scanner.nextInt();
            number[value%10]=value;
        }

        System.out.println("----------------------------------- Array -----------------------------");
        for (int number1=0;number1<number.length;number1++){
            System.out.println(number[number1]+ "\t");
        }


        System.out.println("------------------------ Find Load Factor -----------------------------");
        int count=0;
        for (int counter=0;counter<number.length;counter++){
            if (number[counter]!=0){
                count++;
            }
        }
        double loadFactor = (double) count/number.length;
        System.out.println("load Factor = "+loadFactor);

        System.out.println("----------------------------- New Array -----------------------------");

        int newArray[]=new int[count];
        for (int counter=0,newcounter=0;counter<number.length;counter++){
            if (number[counter]!=0){
                newArray[newcounter]=number[counter];
                newcounter++;
            }

        }

        for (int num:newArray) {
            System.out.println(num);
        }










    }
}
