public class DecreasingTrianglePattern extends StarPattern {
    public  void pattern(int number) {
        for (int row=number-1; row>=0; row--)
       {
            for(int coloumn=0; coloumn <= row-1;coloumn++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }

}
