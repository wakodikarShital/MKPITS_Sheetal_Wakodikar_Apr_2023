package SandglassStarPattern;

public class PyramidStarPattern extends StarPattern{
    @Override
    void sandglassStarPattern(int rows) {
        for (int rowCounter = rows - 1; rowCounter >= 1; rowCounter--) {
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
