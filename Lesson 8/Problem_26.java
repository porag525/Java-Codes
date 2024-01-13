/*(Row sorting) Implement the following method to sort the rows in 
a two dimensional array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 4 * 4 matrix of double 
values and displays a new row-sorted matrix. */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = scanner.nextInt();
        System.out.println("Enter column: ");
        int c = scanner.nextInt();

        double[][] mat=new double[r][c];

        System.out.println("Enter the values of Matrix "+ r + " X " + c + " : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scanner.nextDouble();
            }

        }

        scanner.close();
        double[][] ans=sortRows(mat);
        System.out.println("Row wise sorted Matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
               System.out.print(ans[i][j]);
               System.out.print("\t");
            }
            System.out.println();

        }


        
    }
    public static double[][] sortRows(double[][] m)
    {
        for (int i = 0; i < m.length; i++)
     
            // sorting row number 'i'
            Arrays.sort(m[i]);

        return m;
    }
}
