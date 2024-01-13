
/*(Column sorting) Implement the following method to sort the columns in a two 
dimensional array. A new array is returned and the original array is intact.
public static double[][] sortColumns(double[][] m)
Write a test program that prompts the user to enter a 4 * 4 matrix of double 
values and displays a new column-sorted matrix.*/
import java.util.Arrays;
import java.util.Scanner;

public class Problem_27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = scanner.nextInt();
        System.out.println("Enter column: ");
        int c = scanner.nextInt();

        double[][] mat = new double[r][c];

        System.out.println("Enter the values of Matrix " + r + " X " + c + " : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = scanner.nextDouble();
            }

        }

        scanner.close();
        double[][] ans = sortColumns(mat);
        System.out.println("Column wise sorted Matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }
    }

    public static double[][] sortColumns(double[][] m) {
        transpose_matrix(m);

        for (int i = 0; i < m.length; i++) {
            Arrays.sort(m[i]);
        }
        transpose_matrix(m);
        return m;

    }

    public static double[][] transpose_matrix(double[][] m) {
        // Transpose the matrix .
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m[0].length; j++) {
                // swapping element at index (i, j)
                // by element at index (j, i)
                double temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        return m;
    }

}
