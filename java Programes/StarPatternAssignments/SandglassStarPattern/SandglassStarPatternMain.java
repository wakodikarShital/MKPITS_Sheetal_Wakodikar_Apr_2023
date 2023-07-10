package SandglassStarPattern;

import java.util.Scanner;

public class SandglassStarPatternMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for Sandglass star pattern : ");
        int rows = scanner.nextInt();
        ReversePyramidPattern reversePyramidPattern = new ReversePyramidPattern();
        reversePyramidPattern.sandglassStarPattern(rows);
        PyramidStarPattern pyramidStarPattern = new PyramidStarPattern();
        pyramidStarPattern.sandglassStarPattern(rows);
    }
}
