/*
(Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
array using the following header:
public static void shuffle(int[][] m)
Write a test program that shuffles the following matrix:
int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}}; 
*/

import java.util.Scanner;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = scanner.nextInt();
        System.out.println("Enter column: ");
        int c = scanner.nextInt();

        int[][] mat = new int[r][c];
        System.out.println("Please input the elements of the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        shuffle(mat);

    }

    public static void shuffle(int[][] m) {
        int r1; // random row index
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                do {
                    r1 = (int) (Math.random() * m.length);
                } while (r1 == i);
                int[] temp = m[i];
                m[i] = m[r1];
                m[r1] = temp;
            }
        }

        for (int[] row : m) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    
    }

}
