import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    private static final int[][] PATTERNS = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };

    public int[] solution(int[] answers) {
        int[] scores = new int[PATTERNS.length];

        for (int problemIndex = 0; problemIndex < answers.length; problemIndex++) {
            for (int studentIndex = 0; studentIndex < PATTERNS.length; studentIndex++) {
                if (answers[problemIndex] == getPickedAnswer(studentIndex, problemIndex)) {
                    scores[studentIndex]++;
                }
            }
        }
        int maxScore = Arrays.stream(scores)
                .max()
                .orElse(0);

        return IntStream.range(0, scores.length)
                .filter(studentIndex -> scores[studentIndex] == maxScore)
                .map(studentIndex -> studentIndex + 1)
                .toArray();
    }

    private int getPickedAnswer(int studentIndex, int problemIndex) {
        int[] patten = PATTERNS[studentIndex];
        return patten[problemIndex % patten.length];
    }
}