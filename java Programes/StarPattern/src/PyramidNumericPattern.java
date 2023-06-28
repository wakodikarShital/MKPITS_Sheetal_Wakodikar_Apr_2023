public class PyramidNumericPattern extends StarPattern {
    public void pattern(int number) {

        System.out.println("It is a diamond numeric pattern :");


        for (int row = 1; row <= number; row++)
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
