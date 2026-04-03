class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convertCount = 0;
        int removedZoroCount = 0;
        String target = s;
        
        while (true) {
          String[] tempResult = removeZero(target);
            removedZoroCount += Integer.parseInt(tempResult[1]);
            
            if (tempResult[0].equals("1")) {
                convertCount++;
                break;
            }
            
            target = covertAboutSize(tempResult[0]);
            convertCount++;
        }
        answer[0] = convertCount;
        answer[1] = removedZoroCount;
        
        return answer;
    }
    
    private String[] removeZero(String target) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        String[] result = new String[2];
        
        for (String token : target.split("")) {
            if (token.equals("1")) {
                sb.append(token);
            } else if (token.equals("0")) {
                count++;
            }
            
        }
        result[0] = sb.toString();
        result[1] = String.valueOf(count);
        return result;
    }
    
    private String covertAboutSize(String target) {
        return Integer.toString(target.length(), 2);
    }
}