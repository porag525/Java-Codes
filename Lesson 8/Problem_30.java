/*(Algebra: solve linear equations) Write a method that solves the following 2 * 2
system of linear equations:
a00x + a01y = b0
a10x + a11y = b1
x =( b0a11 - b1a01)/(a00a11 - a01a10)
y =( b1a00 - b0a10)/(a00a11 - a01a10)

The method header is:
public static double[] linearEquation(double[][] a, double[] b)
The method returns null if a00a11 - a01a10 is 0. Write a test program that 
prompts the user to enter a00, a01, a10, a11, b0, and b1 and displays the result. If 
a00a11 - a01a10 is 0, report that “The equation has no solution.”

*/

import java.util.Scanner;

public class Problem_30 {
    public static void main(String[] args) {
        double[][] a = new double[2][2];

        double[] b = new double[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a00:");
        a[0][0] = scanner.nextDouble();
        System.out.println("Enter a01 :");
        a[0][1] = scanner.nextDouble();
        System.out.println("Enter a10:");
        a[1][0] = scanner.nextDouble();
        System.out.println("Enter a11 :");
        a[1][1] = scanner.nextDouble();
        System.out.println("Enter b0: ");
        b[0] = scanner.nextDouble();
        System.out.println("Enter b1: ");
        b[1] = scanner.nextDouble();
        scanner.close();
        double[] ans=linearEquation(a, b);
        if(ans==null)
        {
            System.out.println("The equation has no solution.");
        }
        else{
            System.out.println("Solution for the Linear Equation : ");
            System.out.println(" X = "+ans[0]+"\n"+" Y = "+ans[1]);
        }
    }

    public static double[] linearEquation(double[][] a, double[] b) {

        if (((a[0][0] * a[1][1]) - (a[0][1] * a[1][0])) == 0) {
            return null;
        } else {
            double x = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            double y = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            double[] ans = new double[2];
            ans[0] = x;
            ans[1] = y;
            return ans;
        }

    }

}
