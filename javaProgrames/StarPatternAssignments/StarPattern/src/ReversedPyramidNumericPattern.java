public class ReversedPyramidNumericPattern extends StarPattern {
    public void pattern(int number) {
        for (int row = number-1; row>= 1; row--)
        {
            for (int space = 1; space < row; space++)
            {
                System.out.print(" ");
            }
            for (int coloumn = row; coloumn <= number; coloumn++)
            {
                System.out.print(coloumn+" ");
            }

            System.out.println();
        }
    }
}
