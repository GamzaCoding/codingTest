import java.util.*;

public class Solution {
    public int solution(int n) {
        
        String[] numberArray = String.valueOf(n).split("");
        int answer = 0;
        
        for(String token : numberArray){
            answer += Integer.parseInt(token);
        }
        return answer;
    }
}