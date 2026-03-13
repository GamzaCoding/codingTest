class Solution {
    public int solution(int n) {
        int evenSum = 0;
        
        while(n != 0) {
            if (n % 2 == 0) {
                evenSum += n--;
            } else {
                n--;
            }
        }
        
        return evenSum;
    }
}