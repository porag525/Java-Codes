/*(Locate the smallest element) Write the following method that returns the location 
of the smallest element in a two-dimensional array.
public static int[] locateSmallest(double[][] a)
The return value is a one-dimensional array that contains two elements. These 
two elements indicate the row and column indices of the smallest element in the 
two-dimensional array.
Write a test program that prompts the user to enter a two dimensional array
and displays the location of the smallest element in the array*/

import java.util.Scanner;

public class Problem_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = scanner.nextInt();
        System.out.println("Enter column: ");
        int c = scanner.nextInt();

        double[][] mat=new double[r][c];
        System.out.println("Enter the 2D array : ");
        for(int  i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=scanner.nextDouble();
            }
        }
        scanner.close();
        int[] ans=locateSmallest(mat);
        System.out.println("The location of the smallest element is at ( " + ans[0] +"," +ans[1]+")");

    }
    
    public static int[] locateSmallest(double[][] a)
    {
        double min=a[0][0];
        int[] arr=new int[2];
        int r=0,c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]<min)
                {
                    min=a[i][j];
                    r=i;
                    c=j;
                    
                }

            }
        }
        arr[0]=r;
        arr[1]=c;
        return arr;

    }
}
