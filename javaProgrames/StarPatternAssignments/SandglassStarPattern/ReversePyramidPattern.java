package SandglassStarPattern;

public class ReversePyramidPattern extends StarPattern{
    @Override
    void sandglassStarPattern(int rows) {
        int array[][] = new int[rows][rows];
        for (int rowCounter = 1; rowCounter <= rows; rowCounter++) {
            for (int space = 1; space < rowCounter; space++) {
                System.out.print(" ");
            }

            for (int columnCounter = rowCounter; columnCounter <= rows; columnCounter++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


