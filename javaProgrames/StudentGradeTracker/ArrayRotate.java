package employeepayrollsystem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ArrayRotate {
    public static void main(String[] args) {
        Vector vectorList = new Vector(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
        Scanner scanner = new Scanner(System.in);
        int number;





        for (int counter=0;counter<vectorList.size();counter++){
            System.out.println("Enter the" + counter + "number");
          number=scanner.nextInt();
//          vectorList.add(number%10,number);
//          int index=0;
            vectorList.set(number%10,number);


        }
        System.out.println("Vector List = "+vectorList);


        System.out.println("----------------------------New Vector List ---------------------");

        Vector newVectorList=new Vector(vectorList);
        for (int iterator=0;iterator<vectorList.size();iterator++ ){
            if (vectorList.get(iterator)!=0){
                iterator++;
            }
        }



    }




}
