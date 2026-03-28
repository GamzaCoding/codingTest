import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        int min = s.length();
        for (int length = 1; length <= (s.length() / 2); length++) {
            int compressed = compress(s, length);
            if (compressed <= min) min = compressed;
        }
        return min;        
    }
    
    private int compress(String source, int length) {
        StringBuilder sb = new StringBuilder();
        List<String> tokens = split(source, length);
        
        if (source.length() == 1) return 1;
        
        String before = "";
        int count = 1;
        for (String token : tokens) {
            if (before.equals("")) {
                before = token;
                continue;
            }
            
            if (token.equals(before)) {
                count++;
            } else {
                if (count != 1) sb.append(count);
                sb.append(before);
                before = token;
                count = 1;
            }
        }
        if (count != 1) sb.append(count);
        sb.append(before);
        
        return sb.length();
    }
    // length 만큼 문자열을 자르는 메서드 
    private List<String> split(String target, int length) {
        List<String> tokens = new ArrayList<>();
        
        for (int start = 0; start < target.length(); start += length) {
            int end = start + length;
            if (end > target.length()) end = target.length();
            tokens.add(target.substring(start, end));
        }
        return tokens;
    }
}