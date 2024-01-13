/*(Algebra: multiply two matrices) Write a method to multiply two matrices. The 
header of the method is:
public static double[][] multiplyMatrix(double[][] a, double[][] b)

*/

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row of Matrix-1: ");
        int r1 = scanner.nextInt();
        System.out.println("Enter column of Martix-1: ");
        int c1 = scanner.nextInt();
        System.out.println("Enter row of Matrix-2: ");
        int r2 = scanner.nextInt();
        System.out.println("Enter column of Martix-2: ");
        int c2 = scanner.nextInt();

        double[][] mat1 = new double[r1][c1];
        double[][] mat2 = new double[r2][c2];
        System.out.println("Enter the values of Matrix 1: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = scanner.nextDouble();
            }

        }
        System.out.println("Enter the values of Matrix 2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                mat2[i][j] = scanner.nextDouble();
            }

        }
        scanner.close();
        if (c1 == r2) {
            double[][] ans = multiplyMatrix(mat1, mat2);
            System.out.println("Multiplication of Matrix-1 and Matrix 2 : ");
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    System.out.print(ans[i][j]);
                    System.out.print("  ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix-1 column is not equal to Matrix-2 row.");
            System.out.println("So Matrix-1 and Matrix-2 can't be multiplied.");
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int r=a.length;
        int c=b[0].length;
        double[][] ans=new double[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                double tmp=0;
                for(int k=0;k<a[0].length;k++)
                {
                    tmp+=a[i][k]*b[k][j];  
                }
                ans[i][j]=tmp;
            }
        }
        return ans;

    }

}
