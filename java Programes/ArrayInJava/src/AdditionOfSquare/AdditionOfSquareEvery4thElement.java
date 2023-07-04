package AdditionOfSquare;

public class AdditionOfSquareEvery4thElement implements AdditionOfSquare{
    @Override
    public void calculateAdditionOfSquareEvery4ThElement(){
        // take an 40 integrs in an array

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32,
                33, 54, 64, 69, 68, 67, 61, 62, 63, 75, 74, 72, 71, 11, 96, 76, 73, 45, 49};
        // declare one variable for store the square of sum
        int sum = 0;
        // initialize for loop
        for (int element=3;element<=numbers.length;element=element+4){
            //here the squares of every fourth element
            System.out.print(numbers[element]+ "*" +numbers[element]+ " ");
            // The squares of every 4th element and addition of that
            System.out.print(" + " + " ");
            // The square of every 4th element and the sum of every 4th element of square store in one variable
            sum= sum + (numbers[element]*numbers[element]);

        }
        // print sum of square of every 4th element

        System.out.println("=" + sum);




    }
}



