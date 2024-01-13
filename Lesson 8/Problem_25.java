/*(Markov matrix) An n * n matrix is called a positive Markov matrix if each 
element is positive and the sum of the elements in each column is 1. Write the 
following method to check whether a matrix is a Markov matrix:
public static boolean isMarkovMatrix(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double 
values and tests whether it is a Markov matrix. */

import java.util.Scanner;

public class Problem_25 {
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
        boolean ans=isMarkovMatrix(mat);
        if(ans)
        {
            System.out.println("It is a Markov matrix");
        }
        else{
            System.out.println("It is not a Markov matrix");
        }

        
    }

    public static boolean isMarkovMatrix(double[][] m)
    {
        boolean ans=true;
        boolean flag=true;
        for(int i=0;i<m.length;i++)
        {
            double tmp=0;
            for(int j=0;j<m[0].length;j++)
            {
                if(m[j][i]<0)
                {
                    flag=false;
                    ans=false;
                    break;
                }
                tmp+=m[j][i];
                
            }
            if(flag==false) break;
            if(tmp!=1)
            {
                ans=false;
                break;  
            }
            
        }
        return ans;
    }
}
