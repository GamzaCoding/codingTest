import java.util.*;
class Solution {
    public int solution(String s) {
        Map<String, String> englishNumbers = new HashMap<>();
        
        englishNumbers.put("zero", "0");
        englishNumbers.put("one", "1");
        englishNumbers.put("two", "2");
        englishNumbers.put("three", "3");
        englishNumbers.put("four", "4");
        englishNumbers.put("five", "5");
        englishNumbers.put("six", "6");
        englishNumbers.put("seven", "7");
        englishNumbers.put("eight", "8");
        englishNumbers.put("nine", "9");
        
        for (String english : englishNumbers.keySet()) {
            if (s.contains(english)) {
                s = s.replace(english, englishNumbers.get(english));
            }
        }
        
        return Integer.parseInt(s);
    }
}