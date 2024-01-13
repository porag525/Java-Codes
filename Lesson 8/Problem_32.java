/*(Geometry: area of a triangle) Write a method that returns the area of a triangle 
using the following header:
public static double getTriangleArea(double[][] points)
The points are stored in a 3-by-2 two-dimensional array points with points
[0][0] and points[0][1] for (x1, y1). The triangle area can be computed 
using the formula in Programming Exercise 2.19. The method returns 0 if the 
three points are on the same line. Write a program that prompts the user to enter 
three points of a triangle and displays the triangle’s area
 */

// (1/2) |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|

import java.util.Scanner;

public class Problem_32 {
    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3 : ");
        Scanner scanner = new Scanner(System.in);
        double[][] points = new double[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        double area=getTriangleArea(points);
        if(area==0)
        {
            System.out.println("The three points are on the same line");
        }
        else{
            System.out.println("Area of the triangle is : "+area);

        }
        

    }

    public static double getTriangleArea(double[][] points)
    {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double area=0.5*(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area;

    }

}
