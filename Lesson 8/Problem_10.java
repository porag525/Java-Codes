/*(Largest row and column) Write a program that randomly fills in 0s and 1s into 
a 5-by-5 matrix, prints the matrix, and finds the first row and column with the 
most 1s. Here is a sample run of the program:

01101
01011
10010
11111
00101

The largest row index: 3
The largest column index: 4

*/



import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        byte[][] mat = new byte[5][5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = scanner.nextByte();
            }
        }
        scanner.close();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        int r_idx=0;
        int c_idx=0;
        int mx1 = 0;
        int mx2 = 0;
        for (int i = 0; i < 5; i++) {
            int row_count1 = 0;
            int column_count1 = 0;
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] == 1) {
                    row_count1++;
                }
                if (mat[j][i] == 1) {
                    column_count1++;
                }

            }
            if (row_count1 > mx1) {
                mx1 = row_count1;
                r_idx = i;
            }
            if (column_count1 > mx2) {
                mx2 = column_count1;
                c_idx = i;
            }

        }

        System.out.println("The largest row index : "+r_idx);
        System.out.println("The largest column index : "+c_idx);

    }
}
