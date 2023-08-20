package AdditionOfCube;

public class AdditionSubstractionEvery5thElementCube implements AdditionSubstractionOfCube{

    //here take a method getgetCalculateAdditionSubstractionEvery5ThElementCube()
   public void getCalculateAdditionSubstractionEvery5ThElementCube(){

       //take an array of 40 integers

       int number[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32,
               33, 54, 64, 69, 68, 67, 61, 62, 63, 75, 74, 72, 71, 11, 96, 76, 73, 45, 49};
        // take a sum name of variable for store the cube of sum
       int sum = 0;
       // take a for loop to initialize the condition
       for (int element=4;element<=number.length;element=element+5){
            
           if (element%2!=0) {
               // print the element of cube
               System.out.print(number[element]*number[element]*number[element]);
               System.out.print(" + ");
               sum = sum + number[element] * number[element] * number[element];


           }else {
               // print the element of cube
               System.out.print(number[element]*number[element]*number[element]);
               System.out.print(" - ");
               sum = sum - (number[element]* number[element] * number[element]);
           }

       }
       //Print the sum of all cube addition and substraction
       System.out.print( "=" + sum);
   }
    }

