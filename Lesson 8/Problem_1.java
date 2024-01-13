//(Sum elements row by row) Write a method that returns the sum of 
//all the elements in a specified row in a matrix using the following header:
//public static double sumRow(double[][] m, int rowIndex)

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row in the matrix : ");
        int r = scanner.nextInt();
        System.out.println("Number of column of the matrix is : " + r);
        int c = scanner.nextInt();
        double[][] mat = new double[r][c];
        System.out.println("Please input the elements of the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter the row number which row sum is needed : ");
        int row=scanner.nextInt();
        row--;
        scanner.close();
        double x=sumRow(mat, row);
        System.out.println("Sum of the row "+ row+1 +" is = "+x );
    }

    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for (int i = 0; i < m[rowIndex].length; i++) {
            sum+=m[rowIndex][i];
        }
        return sum;
    }
}