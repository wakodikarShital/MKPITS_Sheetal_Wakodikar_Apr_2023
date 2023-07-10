package SolidDaimondStarPattern;

public class SolidDaimondStarPattern extends DaimondPattern {
    @Override
    void solidDaimondStarPattern(int rows) {
        //        int array[][] = new int[row][row];

        //Code for Upper half stars
        for(int rowCounter = 1; rowCounter <= rows; rowCounter++){
            //spaces
            for(int space=1; space<=rows-rowCounter; space++){
                System.out.print(" ");
            }
            //stars
            for(int columnCounter = 1; columnCounter <= 2*rowCounter-1; columnCounter++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Code for Lower half stars
        for(int rowCounter = rows-1; rowCounter >= 1; rowCounter--){
            //spaces
            for(int space=1; space<=rows-rowCounter; space++){
                System.out.print(" ");
            }
            //stars
            for(int columnCounter = 1; columnCounter <= 2*rowCounter-1; columnCounter++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

