// import java.util.Scanner;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Personal Income Tax Calculator");
        System.out.println("------------------------------\n");
        System.out.println("Type of Persons");
        System.out.println("Single-> press 1");
        System.out.println("Married jointly or qualifying widow(er) -> press 2");
        System.out.println("Married separately -> press 3");
        System.out.println("Head of household -> press 4");
        System.out.println("Enter the type of Person ");
        int type = scanner.nextInt();
        type--;
        System.out.println("Enter income : ");
        double income = scanner.nextDouble();
        double tax = computeTax(income, type);
        System.out.println("Total Tax = " +tax);
        scanner.close();

    }

    public static double computeTax(double income, int type) {
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = {
                { 8350, 33950, 82250, 171550, 372950 }, // Single filer
                { 16700, 67900, 137050, 20885, 372950 }, // Married jointly
                                                         // −or qualifying widow(er)
                { 8350, 33950, 68525, 104425, 186475 }, // Married separately
                { 11950, 45500, 117450, 190200, 372950 } // Head of household
        };
        double tax;
        if(income<=brackets[type][0])
        {
          
            return Math.round( income*rates[0]);
        }
        tax=brackets[type][0]*rates[0];

        for(int i=1;i<brackets[0].length;i++)
        {
            if(income>brackets[type][i])
            {
                tax+=(brackets[type][i]-brackets[type][i-1])*rates[i];
            }
            else
            {
                tax+=(income-brackets[type][i-1])*rates[i];
                return  Math.round(tax);
            }
        }
        tax+=(income-brackets[type][4])*rates[5];
        return Math.round(tax);

    }
}
