/*(Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some 
face up and some face down. You can represent the state of the coins using a 
3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
0 0 0   1 0 1   1 1 0   1 0 1     1 0 0
0 1 0   0 0 1   1 0 0   1 1 0     1 1 1
0 0 0   1 0 0   0 0 1   1 0 0     1 1 0
Each state can also be represented using a binary number. 
For example, the preceding matrices correspond to the numbers
000010000 101001100 110100001 101110100 100111110
There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 
3, . . . , and 511 to represent all states of the matrix. Write a program that prompts 
the user to enter a number between 0 and 511 and displays the corresponding 
matrix with the characters H and T */

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 511: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] binary = new int[9];
        for (int i = 0; i < 9; i++) {
            binary[i] = 0;
        }
        int j = 0;

        while (n > 0) {

            binary[j] = n % 2;
            n /= 2;
            j++;
        }
        int x = 0;
        for (int i = 8; i >= 0; i--) {
            if(x==3)
            {
                System.err.println();
                x=0;
            }
            if (binary[i] == 1) {
                System.out.print('T'+" ");
                x++;
            }
            else
            {
                System.out.print('H'+" ");
                x++;
            }
        }
        scanner.close();

    }

}
