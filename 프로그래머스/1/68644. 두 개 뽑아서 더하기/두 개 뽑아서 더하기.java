import java.util.stream.*;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                result.add(numbers[i] + numbers[j]);
            }
        }
        
       return result.stream()
            .sorted()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}