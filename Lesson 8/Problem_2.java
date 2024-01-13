/*(Average the major diagonal in a matrix) Write a method that averages all the 
numbers in the major diagonal in an n * n matrix of double values using the 
following header:
public static double averageMajorDiagonal(double[][] m)
 */


import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of row in the matrix : ");
        int r = scanner.nextInt();
        System.out.println("Number of column of the matrix is : " );
        int c = scanner.nextInt();

        double[][] mat = new double[r][c];
        System.out.println("Please input the elements of the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        System.out.println("Average of the elements in the major diagonal is "+averageMajorDiagonal(mat));

    }

    public static double averageMajorDiagonal(double[][] m)
    {
        double sum=0;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<m[i].length;j++)
            {
                if(i==j)
                {
                    sum+=m[i][j];
                }

            }
        }
        int r=m.length;
        int c=m[0].length;
        double avarage=sum/Math.min(r,c);
        return avarage;
    }
}
