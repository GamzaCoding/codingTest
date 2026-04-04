class Solution {
    public boolean solution(String s) {
        if (!lengthCondition(s)) return false;
        
        for (String token : s.split("")) {
            if (token.matches("[a-zA-Z]")) return false;
        }
        
        return true;
    }
    
    private boolean lengthCondition(String s) {
        return s.length() == 4 || s.length() == 6;
    }
}