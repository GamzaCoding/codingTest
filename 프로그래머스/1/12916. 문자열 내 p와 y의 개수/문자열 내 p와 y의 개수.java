class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        String filterd = s.toLowerCase();
        
        for (String token : filterd.split("")) {
            if (token.equals("p")) pCount++;
            if (token.equals("y")) yCount++;
        }
        
        if (pCount == yCount) return true;
        
        return false;
    }
}