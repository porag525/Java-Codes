/*(Algebra: add two matrices) Write a method to add two matrices. The header of 
the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)

In order to be added, the two matrices must have the same dimensions and the 
same or compatible types of elements. Let c be the resulting matrix. 
Each element cij is aij + bij. For example, for two 2 * 2 matrices a and b, c is

(a11 a12)
(a21 a22)
    +
(b11 b12)
(b21 b22)
   =
(a11 + b11 a12 + b12)
(a21 + b21 a22 + b22)

Write a test program that prompts the user to enter two 2 * 2 matrices and 
displays their sum.

*/

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = scanner.nextInt();
        System.out.println("Enter column: ");
        int c = scanner.nextInt();

        double[][] mat1 = new double[r][c];
        double[][] mat2 = new double[r][c];
        System.out.println("Enter the values of Matrix 1: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Enter the values of Matrix 2: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = scanner.nextDouble();
            }

        }
        scanner.close();
        double[][] ans=addMatrix(mat1, mat2);
        System.out.println("Sum of Matrix-1 and Matrix 2 : ");
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sumMat = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumMat[i][j] = a[i][j] + b[i][j];
            }

        }
        return sumMat;

    }

}
