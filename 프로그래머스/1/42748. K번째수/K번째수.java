import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            answer[i] = cal(array, commands[i]);    
        }
                
        return answer;
    }
    
    public int cal(int[] array, int[] command) {
        int startIndex = command[0] - 1;
        int endIndex = command[1] - 1;
        int targetIndex = command[2] - 1;
        List<Integer> list = new ArrayList<>();
            
        for (int i = startIndex; i <= endIndex; i++) {
            list.add(array[i]);
        }
        List<Integer> sortedList = list.stream()
                               .sorted()
                               .collect(Collectors.toList());
        
        return sortedList.get(targetIndex);
    }
}