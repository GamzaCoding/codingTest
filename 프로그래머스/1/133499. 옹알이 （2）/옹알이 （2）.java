import java.util.*;

class Solution {
    public static String[] basics = {"aya", "ye", "woo", "ma"};
    
    public int solution(String[] babbling) {
        int result = 0;
        
        for (String word : babbling) {
            if (canSpeak(word)) {
                result++;
            }
        }
        return result;
    }
    
    public boolean canSpeak(String word) {
        if (isDoubleSpeak(word)) {
            return false;
        }
        for (String basic : basics) {
            word = word.replace(basic, " ");
        }
        
        word = word.replace(" ", "");
        
        if (word.length() == 0) {
            return true;
        }
        return false;
    }
    
    public boolean isDoubleSpeak(String word) {
        return word.contains("ayaaya") ||
            word.contains("yeye") ||
            word.contains("woowoo") ||
            word.contains("mama");
    }
}