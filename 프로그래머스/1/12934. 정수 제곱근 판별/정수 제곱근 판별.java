class Solution {
    public long solution(long n) {
        
        double nSqrtDouble = Math.sqrt(n);
        long nSqrtLong = (long) Math.sqrt(n);
        
        if(nSqrtDouble == (double) nSqrtLong){
            return (long) Math.pow(nSqrtLong+1, 2); 
        }
    
        return -1L;
    }
}