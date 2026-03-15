import java.util.List;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (String token : s.split("")) {
            sb.append(CaesarCipher.transfer(token, n));
        }
        
        return sb.toString();
    }
    
    static class CaesarCipher {
        private final static String BLANK = " ";
        private final static List<String> alphabets = List.of(
        "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        
        public static String transfer(String token, int pushNum) {
            if (token.equals(BLANK)) {
                return BLANK;
            }
            
            String target = token;
            boolean uppperCaseFlag = false;
            
            if (Character.isUpperCase(target.charAt(0))) {
                uppperCaseFlag = true;
                target = token.toLowerCase();
            }
            
            
            int tokenIndex = alphabets.indexOf(target);
            int transferIndex = tokenIndex + pushNum;
            if (transferIndex >= 26) {
                transferIndex = (transferIndex % 26);
            }
            
            String transferdTarget = alphabets.get(transferIndex);
            
            if (uppperCaseFlag) {
                return transferdTarget.toUpperCase();
            }
            return transferdTarget;
        }
    }
}