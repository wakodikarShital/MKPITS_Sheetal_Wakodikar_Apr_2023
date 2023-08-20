public class RightDownwardTrianglePattern extends StarPattern {

    public void pattern(int number) {

        System.out.println("It is right downward triangle star pattern :");

        for (int row = number - 1; row >= 0; row--) {
            for (int coloumn= 0; coloumn <= row; coloumn++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}




