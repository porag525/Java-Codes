/*(Compute the weekly hours for each employee) Suppose the weekly hours 
for all employees are stored in a two-dimensional array. Each row records an 
employee’s seven-day work hours with seven columns.
For example, the following array stores the work hours for eight employees.
Write a program that displays employees and their 
total hours in increasing order of the total hours. */
public class Problem_4 {
    public static void main(String[] args) {
        int[][] work_hours = {
                { 2, 4, 3, 4, 5, 8, 8 },
                { 7, 3, 4, 3, 3, 4, 4 },
                { 3, 3, 4, 3, 3, 2, 2 },
                { 9, 3, 4, 7, 3, 4, 1 },
                { 3, 5, 4, 3, 6, 3, 8 },
                { 3, 4, 4, 6, 3, 4, 4 },
                { 3, 7, 4, 8, 3, 8, 4 },
                { 6, 3, 5, 9, 2, 7, 9 } };
        
        int[] hours=new int[work_hours.length];
        for(int i=0;i<work_hours.length;i++)
        {   int sum=0;
            for(int j=0;j<work_hours[i].length;j++)
            {
                sum+=work_hours[i][j];
            }
            hours[i]=sum;
        }
        final int max=10000;
        for (int i = 0; i < hours.length; i++) {
            int min = max;
            int s = 0;
            for (int j = 0; j < hours.length; j++) {
                if (hours[j] < min) {
                    min = hours[j];
                    s = j;
                }
            }
            hours[s] = max;
             System.out.println("Total work hours of " + s + "'s employee is " + min);

        }
    }

    
}