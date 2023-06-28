public class LowerDiamondPattern extends StarPattern  {

    public void pattern(int number){
        int  coloumn, row, space = 1;
        for (  row = 1; row<= number - 1; row++)
        {
            for (  coloumn = 1; coloumn<= space; coloumn++)
            {
                System.out.print(" ");
            }
            space++;
            for (  coloumn = 1; coloumn<= 2 * (number-row) - 1; coloumn++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
