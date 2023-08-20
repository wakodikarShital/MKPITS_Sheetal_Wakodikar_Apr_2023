package HollowDaimondPattern;

import java.util.Scanner;

public class HollowDaimondStarPattern extends DaimondPattern {
    @Override
    void daimondPattern(int size) {
        //        int array[][] = new int[9][9];

        int middle = size/ 2;


        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row <= middle) {
                    if ( col == middle + row || col == middle - row ) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else {
                    if (col == middle - (size - 1 - row) || col == middle + (size - 1 - row)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

    }

}

