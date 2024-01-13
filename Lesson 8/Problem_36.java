/*
(Latin square) A Latin square is an n-by-n array filled with n different 
Latin letters,each occurring exactly once in each row and once in each column.
Write a program that prompts the user to enter the number n and the array of characters, 
as shown in the sample output, and checks if the input array is a Latin square. 
The characters are the first n characters starting from A.

*/

import java.util.Scanner;

public class Problem_36 {
    public static void main(String[] args) {
        System.out.println("Enter number n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] mat = new char[n][n];

        int[] fre = new int[150];
        boolean flag = true;
        System.out.println("Enter "+n+" rows of letters separated by spaces:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char tmp = scanner.next().charAt(0);
                int x = tmp - '0';
                if (fre[x] == 0 && x < n + 17 && x >= 17) {
                    mat[i][j] = tmp;
                    fre[x]++;
                } else {
                    flag = false;
                    // System.out.println("Wrong Input");
                    break;

                }
            }
            for (int k = 17; k < 50; k++) {
                fre[k] = 0;
            }

            if (flag == false) {
                break;
            }
        }
        scanner.close();
        int x=16+n;
        // char x=(char)(n+'0');
        char charA = (char) (x + '0');
        if (flag) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("Wrong input: the letters must be from A to "+charA );
        }
    }

}
