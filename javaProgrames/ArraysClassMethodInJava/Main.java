import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int []array={1,2,3,4,5,6,7,8,9,10};
        int []array1={10,14,13,15,20,19};

        System.out.println("Integer Array as List: " +Arrays.asList(array));
        System.out.println("binary search : " +Arrays.binarySearch(array,4));
        Arrays.sort(array1);
        System.out.println("found at index= " +Arrays.binarySearch(array1,14));
        System.out.println(Arrays.compare(array,array1));
        int newArray[]=Arrays.copyOf(array,12);
        for (int number=0;number<newArray.length;number++){
            System.out.println("Copyof method : "+newArray[number]);
        }

        int newArray1[]=Arrays.copyOfRange(array1,0,7);
        for (int number1=0;number1<newArray1.length;number1++){
            System.out.println("Copy range of method : "+newArray1[number1]);

        }

        List newList = Arrays.asList(12,15,13,"shital",0.5,22);
        System.out.println(newList);






    }
}