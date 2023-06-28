public class UpperDaimondPattern extends StarPattern {
    public  void pattern(int number) {

        System.out.println(" It is star diamond shape pattern :");


        int  coloumn, row, space = 1;
//
        space = number - 1;
        for (row = 1; row <= number; row++) {
            for (coloumn = 1; coloumn <= space; coloumn++) {
                System.out.print(" ");
            }
            space--;
            for (coloumn = 1; coloumn <= 2 * row - 1; coloumn++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }










//        space = 1;
//        for (j = 1; j<= n - 1; j++)
//        {
//            for (i = 1; i<= space; i++)
//            {
//                System.out.print(" ");
//            }
//            space++;
//            for (i = 1; i<= 2 * (n-j) - 1; i++)
//            {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
    }


