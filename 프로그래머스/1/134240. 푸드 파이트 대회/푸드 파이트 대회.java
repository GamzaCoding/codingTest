import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.*;

class Solution {
    public String solution(int[] food) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(0);
        
        for (int i = food.length - 1; i > 0; i--) {
            if (food[i] == 1) continue;
            
            int foodCount = food[i] / 2;
            for (int j = foodCount; j > 0; j--) {
                deque.addFirst(i);
                deque.addLast(i);
            }
        }
                
        return deque.stream()
                     .map(String::valueOf)
                     .collect(Collectors.joining("")); 
    }
}