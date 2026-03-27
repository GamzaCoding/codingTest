class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] result = s.split("");
        boolean flag = true;
        
        for (String token : s.split("")) {
            if (token.equals(" ")) {
                flag = true;
                sb.append(" ");
                continue;
            }
            if (flag) {
                sb.append(token.toUpperCase());
                flag = false;
                continue;
            }
            sb.append(token.toLowerCase());
            flag = true;
        }
        
        return sb.toString();
    }
}