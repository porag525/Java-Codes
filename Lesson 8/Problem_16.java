/*
(Sort two-dimensional array) Write a method to sort a two-dimensional array 
using the following header:
public static void sort(int m[][])
The method performs a primary sort on rows, and a secondary sort on columns. 
For example, the following array
{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
will be sorted to
{{4, 5},{4, 2},{4, 1},{1, 7},{1, 2},{1, 1}}.
 */

import java.util.Scanner;

public class Problem_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row :");
        int r = scanner.nextInt();
        System.out.println("Enter column : ");
        int c = scanner.nextInt();

        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        sort(mat);
    }

    public static void sort(int[][] m) {

        for (int i = 0; i < m.length - 1; i++) {
            int currentIndex = i;
            int[] current = m[i];
            for (int j = i + 1; j < m.length; j++) {
                if (current[0] > m[j][0] || current[0] == m[j][0] && current[1] > m[j][1])
                {
                    current = m[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                m[currentIndex] = m[i];
                m[i] = current;
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
