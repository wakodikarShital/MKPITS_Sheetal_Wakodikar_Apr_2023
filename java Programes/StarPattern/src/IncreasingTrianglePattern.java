public class IncreasingTrianglePattern extends StarPattern {
    public  void pattern(int number) {

        System.out.println("It is right pascal's traingle pattern :");

        for (int row= 0; row<= number -1 ; row++)
        {
            for (int coloumn=0; coloumn<=row; coloumn++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }

    }
    }

