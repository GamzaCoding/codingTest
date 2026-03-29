import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (s1,s2) -> {
           
            char target = s1.charAt(n);
            char other = s2.charAt(n);
            
            if (target != other) {
                return Character.compare(target, other);
            }
            
            return s1.compareTo(s2);
        });
        
        return strings;
    }
}