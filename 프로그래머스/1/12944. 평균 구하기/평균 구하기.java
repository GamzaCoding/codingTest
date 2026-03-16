class Solution {
    public double solution(int[] arr) {
        int sum = 0;
        
        for(int token : arr){
            sum += token;
        }
        
        return sum / (double) arr.length;
    }
}