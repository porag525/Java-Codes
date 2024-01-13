/*(Even number of 1s) Write a program that generates a 6-by-6 two-dimensional 
matrix filled with 0s and 1s, displays the matrix, and checks if every row and 
every column have an even number of 1s. */

import java.util.Scanner;

public class Problem_22 {
    public static void main(String[] args) {
        byte[][] mat = new byte[6][6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                mat[i][j] = scanner.nextByte();
            }
        }
        scanner.close();
        boolean ans = true;

        for (int i = 0; i < mat.length; i++) {
            int row_wise=0;
            int column_wise=0;
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]==1) row_wise++;
                else column_wise++;

            }
            if(row_wise%2!=0  || column_wise%2!=0)
            {
                ans=false;
                break;
            }
        }

        if(ans)
        {
            System.out.println("Every row and every column have an even number of 1s.");
        }
        else{
            System.out.println("Every row and every column don't have an even number of 1s.");
        }
    }

}
