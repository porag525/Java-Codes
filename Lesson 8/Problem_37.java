/*(Guess the capitals) Write a program that repeatedly prompts the user to enter 
a capital for a state. Upon receiving the user input, the program reports whether 
the answer is correct. Assume that 50 states and their capitals are stored in a 
two-dimensional array, as shown in Figure 8.10. The program prompts the user to 
answer all states’ capitals and displays the total correct count. The user’s answer 
is not case-sensitive. */

import java.util.Scanner;
in

public class Problem_37 {
    public static void main(String[] args) {
        final String[][] capitals = { { "Alabama", "Montgomery" },
                { "Alaska", "Juneau" },
                { "Arizona", "Phoenix" },
                { "Arkansas", "Little Rock" },
                { "California", "Sacramento" },
                { "Colorado", "Denver" },
                { "Connecticut", "Hartford" },
                { "Delaware", "Dover" },
                { "Florida", "Tallahassee" },
                { "Georgia", "Atlanta" },
                { "Hawaii", "Honolulu" },
                { "Idaho", "Boise" },
                { "Illinois", "Springfield" },
                { "Maryland", "Annapolis" },
                { "Minnesota", "Saint Paul" },
                { "Iowa", "Des Moines" },
                { "Maine", "Augusta" },
                { "Kentucky", "Frankfort" },
                { "Indiana", "Indianapolis" },
                { "Kansas", "Topeka" },
                { "Louisiana", "Baton Rouge" },
                { "Oregon", "Salem" },
                { "Oklahoma", "Oklahoma City" },
                { "Ohio", "Columbus" },
                { "North Dakota", "Bismark" },
                { "New York", "Albany" },
                { "New Mexico", "Santa Fe" },
                { "New Jersey", "Trenton" },
                { "New Hampshire", "Concord" },
                { "Nevada", "Carson City" },
                { "Nebraska", "Lincoln" },
                { "Montana", "Helena" },
                { "North Carolina", "Raleigh" },
                { "Missouri", "Jefferson City" },
                { "Mississippi", "Jackson" },
                { "Massachusetts", "Boston" },
                { "Michigan", "Lansing" },
                { "Pennsylvania", "Harrisburg" },
                { "Rhode Island", "Providence" },
                { "South Carolina", "Columbia" },
                { "South Dakota", "Pierre" },
                { "Tennessee", "Nashville" },
                { "Texas", "Austin" },
                { "Utah", "Salt Lake City" },
                { "Vermont", "Montpelier" },
                { "Virginia", "Richmond" },
                { "Washington", "Olympia" },
                { "West Virginia", "Charleston" },
                { "Wisconsin", "Madison" },
                { "Wyoming", "Cheyenne" }
        };

        Scanner scanner = new Scanner(System.in);
        int correct_answer = 0;

        for (int i = 0; i < capitals.length; i++) {
            System.out.println("What is the capital of " + capitals[i][0] + "?");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(capitals[i][1])) {
                System.out.println("Your answer is correct");
                correct_answer++;
            } else {
                System.out.println("The correct answer should be " + capitals[i][1]);
            }
        }
        System.out.println("The correct count is " + correct_answer);
        scanner.close();
    }
}
