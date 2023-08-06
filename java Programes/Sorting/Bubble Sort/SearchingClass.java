import java.util.Scanner;

public class SearchingClass {
    public void searchingMethod(){
        int arr[]={1,2,3,4,5};
        int n;
        int i;

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for ( i=0;i< arr.length;i++){
            if(n== arr[i]){


                System.out.println("Number is matched on Index of array is  "  + i);
                break;
            }

//            else {
//                System.out.println( "Number is not matched");
//            }

        }
        if(i== arr.length){
            System.out.println("Number is not found");

        }


    }
}
