package HollowDaimondPattern;

import java.util.Scanner;

public class HollowDaimondPatterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of size for Hollow Daimond star pattern : ");
        int size = scanner.nextInt();
        HollowDaimondStarPattern hollowDaimondStarPattern = new HollowDaimondStarPattern();
        hollowDaimondStarPattern.daimondPattern(size);
    }
}
