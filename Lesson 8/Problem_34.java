/*
(Geometry: rightmost lowest point) In computational geometry, often you need 
to find the rightmost lowest point in a set of points. Write the following method 
that returns the rightmost lowest point in a set of points:
public static double[] getRightmostLowestPoint(double[][] points)
Write a test program that prompts the user to enter the coordinates of six points 
and displays the rightmost lowest point.
*/

import java.util.Scanner;

public class Problem_34 {
    public static void main(String[] args) {
        System.out.println("Enter Number of points : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double[][] points = new double[n][2];
        System.out.println("Enter " + n + " points:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        double[] ans = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + ans[0] + "," + ans[1] + ")");

    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] Right_Most = points[0];

        for (int i = 1; i < points.length; i++) {

            if (points[i][1] < Right_Most[1]) {

                Right_Most = points[i];
            } else if (points[i][1] == Right_Most[1] && points[i][0] > Right_Most[0]) {

                Right_Most = points[i];
            }
        }
        return Right_Most;

    }

}
