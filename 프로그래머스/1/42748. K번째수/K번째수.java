import java.util.*;

class Solution {
  // array = [1,5,2,6,3,7,4], commands = [[2, 5, 3],[4, 4, 1],[1, 7, 3]], result = [5, 6, 7]
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answers = new ArrayList<>();

        for (int[] command : commands) {
            answers.add(getSolution(array, command));
        }

        return answers.stream()
                .mapToInt(x -> x).toArray();
    }

    private int getSolution(int[] array, int[] command) {
        int[] cuttingArray = Arrays.copyOfRange(array, command[0] - 1, command[1] + 1 - 1);
        Arrays.sort(cuttingArray);
        return cuttingArray[command[2] - 1];
    }
}