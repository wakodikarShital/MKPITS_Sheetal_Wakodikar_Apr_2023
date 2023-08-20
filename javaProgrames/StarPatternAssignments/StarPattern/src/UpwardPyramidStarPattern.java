public class UpwardPyramidStarPattern extends StarPattern {
    public void pattern(int number) {

        System.out.println("It is sandglass star pattern :");

        for (int row=0;row<=number-1;row++){
            for (int space=1;space<=row;space++){
                System.out.print(" ");
            }
            for (int coloumn=0;coloumn<=number-1-row;coloumn++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}



