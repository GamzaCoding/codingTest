class Solution {
    public long solution(int[] absolutes, boolean[] signs) {
        long result = 0;
        
        for(int i = 0; i < absolutes.length; i++){
            if(!signs[i]){
                result  -= absolutes[i];
                continue;
            }
            result += absolutes[i];
        }
    
        return result;
    }
              
}