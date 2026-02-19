import java.util.*;

class Solution {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];

        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (lastIndex.containsKey(ch)) {
                answer[i] = i - lastIndex.get(ch);
            } else {
                answer[i] = -1;
            }

            lastIndex.put(ch, i);
        }

        return answer;
        
    }
}