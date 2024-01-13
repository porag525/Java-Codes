/*(Sort students on grades) Rewrite Listing 8.2, GradeExam.java,
to display students in decreasing order of the number of correct answers. */
public class Problem_3 {
    public static void main(String[] args) {
        char[][] answers = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };

        char[] keys = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
        int[] mark = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            mark[i] = correctCount;
            // System.out.println("Student " + i + "'s correct count is " + correctCount);
        }
        for (int i = 0; i < mark.length; i++) {
            int mx = 0;
            int s = 0;
            for (int j = 0; j < mark.length; j++) {
                if (mark[j] > mx) {
                    mx = mark[j];
                    s = j;
                }
            }
            mark[s] = 0;
            System.out.println("Student " + s + "'s correct count is " + mx);

        }

    }

}
