/*(Geometry: intersecting point) Write a method that returns the intersecting point of 
two lines. The intersecting point of the two lines can be found by using the formula 
given in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the 
two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is:
public static double[] getIntersectingPoint(double[][] points)
The intersecting point of the two lines can be found by solving the following linear 
equations:
 (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
The points are stored in a 4-by-2 two-dimensional array points with (points 
[0][0], points[0][1]) for (x1, y1). The method returns the intersecting point 
or null if the two lines are parallel. Write a program that prompts the user to enter 
four points and displays the intersecting point. */

import java.util.Scanner;

public class Problem_31 {
    static final int X = 0;
    static final int Y = 1;

    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[4][2];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = scanner.nextDouble();

            }
        }

        scanner.close();

        double[] ans = getIntersectingPoint(points);
        if (ans == null) {
            System.out.println("The lines are Parallel.No intersecting point between the two line");
        } else {
            System.out.println("The Intersecting point of the two line is (" + ans[0] + " , " + ans[1] + ")");
        }

    }

    public static double[] getIntersectingPoint(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];

        // a1x + b1y + c1= 0 and a2x + b2y + c2 = 0

        // a1=(y1-y2)              a2=(y3-y4)
        // b1=-(x1-x2)             b2=-(x3-x4)

        // (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
        //      a1 x +       b1  y   =       c1
        // (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        //      a2 x +       b2  y   =       c2

        // Line 1 represented as a1x + b1y = c1
        double a1 = (y1 - y2); 
        double b1 = -(x1 - x2);
        //c1= (y1 - y2) * x1 - (x1 - x2) * y1
        double c1 = (a1 * x1) - ((x1 - x2) * y1); 

        // Line 2 represented as a2x + b2y = c2
        double a2 = (y3 - y4);
        double b2 = -(x3 - x4);
        //c2= (y3 - y4)x3 - y3
        double c2 = a2 * x3 - ((x3 - x4) * y3);

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            // The lines are parallel. This is simplified
            return null;
        } else {
            double[] ans = new double[2];
            double x = (b2 * c1 - b1 * c2) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;

            ans[0] = x;
            ans[1] = y;
            return ans;
        }

    }

}
