/*(Geometry: same line?) Programming Exercise 6.39 gives a method for testing 
whether three points are on the same line.
Write the following method to test whether all the points in the array points are 
on the same line:

public static boolean sameLine(double[][] points)
Write a program that prompts the user to enter five points and displays whether 
they are on the same line.
*/

import java.util.Scanner;

public class Problem_15 {
    public static void main(String[] args) {
        System.out.println("Enter Number of Points : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        double[][] points = new double[size][2];
        System.out.println("Enter " + size + " points :");
        for (int i = 0; i < size; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }
        scanner.close();
        boolean ans = sameLine(points);
        if (ans) {
            System.out.println("The five points are  on the same line");
        } else {
            System.out.println("The five points are not on  the same line");
        }

    }

    public static boolean sameLine(double[][] points) {
        double slope = (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]);
        boolean ans = true;
        boolean flag = true;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double tmp = (points[i][1] - points[j][1]) / (points[i][0] - points[j][0]);
              
                if (slope != tmp) {
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                ans = false;
                break;
            }
        }
        return ans;
    }

}
