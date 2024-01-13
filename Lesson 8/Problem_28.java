/*(Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly 
identical if their corresponding elements are equal. Write a method that returns 
true if m1 and m2 are strictly identical, using the following header:
public static boolean equals(int[][] m1, int[][] m2)
 Write a test program that prompts the user to enter two 3 * 3 arrays of integers 
and displays whether the two are strictly identical. */

import java.util.Scanner;

public class Problem_28 {
    public static void main(String[] args) {
        int r=3,c=3;
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter row of Matrix: ");
        //  r = scanner.nextInt();
        // System.out.println("Enter column of Martix: ");
        // c = scanner.nextInt();

        int[][] Mat1=new int[r][c];
        int[][] Mat2=new int[r][c];

        System.out.println("Enter list1:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Mat1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter list2:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Mat2[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        boolean x=equals(Mat1, Mat2);
        if(x){
            System.out.println("The two arrays are strictly identical");
        }
        else{
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2)
    {
        boolean ans=true;
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[0].length;j++)
            {
                if(m1[i][j]==m2[i][j])
                {
                    continue;
                }
                else
                {
                    ans=false;
                    break;
                }
            }
            if(ans==false) break;
        }
        return ans;
    }
}
