// Program: Mr. Tarazi, ASK HS Technology Teacher
// Date: Tuesday, Feb 23th, 2020
// Objective: Traversing 2D Array. Row Major Order, Column Major Order, Enhanced For Loop

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] theArray = {{1,2,3},{4,5,6}, {7,8,9}};

        // For Loop - Row major order
        for (int i=0; i<theArray.length; i++) {
            for (int j=0; j<theArray[0].length; j++)
                System.out.print(theArray[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        // For Loop - Column major order
        for (int i=0; i<theArray[0].length; i++) {
            for (int j=0; j< theArray.length; j++)
                System.out.print(theArray[j][i] + " ");
            System.out.println();
        }
        System.out.println();

        // Enhanced For Loop

        for (int[] row: theArray) {
            for (int item:row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}
