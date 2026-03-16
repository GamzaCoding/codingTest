class Solution {
    boolean solution(String s) {
        
        long pCount = countChar(s.toLowerCase(), 'p');
        long yCount = countChar(s.toLowerCase(), 'y');
        
        if(pCount == yCount){
            return true;
        }
        return false;
    }
    
    
    public static long countChar(String str, char ch) {        
        return str.chars()
            .filter(c -> c == ch)
            .count();
        }
}