public class ReversedPyramidStarPattern extends StarPattern {
    public  void pattern(int number) {

        System.out.println("It is Reversed pyramid star pattern :");

        for (int row= 0; row<= number-1 ; row++)
        {
            for (int space=0; space<=row; space++)
            {
                System.out.print(" ");
            }
            for (int coloumn=0; coloumn<=number-1-row; coloumn++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}
