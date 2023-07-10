public class DownwardPyramidPattern extends StarPattern{
    public void pattern(int number) {

        for (int row= number-1; row>= 0; row--)
        {
            for (int space=0; space< row ;space++)
            {
                System.out.print(" ");
            }
            for (int coloumn=row; coloumn<=number-1; coloumn++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}
