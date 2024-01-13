/*(Explore matrix) Write a program that prompts the user to enter the length of a 
square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and 
finds the rows, columns, and diagonals with all 0s or 1s*/

import java.util.Scanner;

public class Problem_14 {
    public static void main(String[] args) {
        System.out.println("Enter the size for the matrix: ");
        Scanner scanner =new Scanner(System.in);
        int size=scanner.nextInt();
        byte[][] mat=new byte[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                mat[i][j]=scanner.nextByte();
            }
        }
        scanner.close();
        
    }
    
}
