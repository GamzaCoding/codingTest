import java.util.List;

class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char alphabet : charArr) {
            sb.append(push(alphabet, n));
        }
        
        return sb.toString();
    }
    
    private char push(char alphabet, int length) {
        if (alphabet == ' ') return alphabet;
        
        int offset = Character.isUpperCase(alphabet) ? 'A' : 'a';
        int givenPosition = alphabet - offset; // A or a를 기준으로 한 index를 나타냄
        int resultPosition = (givenPosition + length) % 26;
        
        return (char) (resultPosition + offset);
    }
}