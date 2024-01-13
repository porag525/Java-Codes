/*(Identical arrays) The two-dimensional arrays m1 and m2 are identical if they 
have the same contents. Write a method that returns true if m1 and m2 are identical,
using the following header:
public static boolean equals(int[][] m1, int[][] m2)
Write a test program that prompts the user to enter two 3 * 3 arrays of integers 
and displays whether the two are identical. */

import java.util.Scanner;
import java.util.Arrays;

public class Problem_29 {
    public static void main(String[] args) {
        int r = 3, c = 3;
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter row of Matrix: ");
        // r = scanner.nextInt();
        // System.out.println("Enter column of Martix: ");
        // c = scanner.nextInt();

        int[][] Mat1 = new int[r][c];
        int[][] Mat2 = new int[r][c];

        System.out.println("Enter list1:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter list2:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Mat2[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        boolean x=equals(Mat1, Mat2);

        if(x){
            System.out.println("The two arrays are identical");
        }
        else{
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        int[] x = new int[9];
        int[] y = new int[9];
        int k=0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                x[k]=m1[i][j];
                y[k]=m2[i][j];
                k++;
            }
        }

        Arrays.sort(x);
        Arrays.sort(y);
        boolean ans=true;
        for(int i=0;i<x.length;i++)
        {
            if(x[i]!=y[i])
            {
                ans=false;
                break;        
            }

        }
        return ans;

    }
}
