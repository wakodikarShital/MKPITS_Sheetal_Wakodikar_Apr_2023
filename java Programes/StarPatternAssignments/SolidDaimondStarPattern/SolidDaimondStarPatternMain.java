package SolidDaimondStarPattern;

import java.util.Scanner;

public class SolidDaimondStarPatternMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for solid star diamond pattern : ");
        int rows = scanner.nextInt();

        SolidDaimondStarPattern solidDaimondStarPattern = new SolidDaimondStarPattern();
        solidDaimondStarPattern.solidDaimondStarPattern(rows);
    }
    }

