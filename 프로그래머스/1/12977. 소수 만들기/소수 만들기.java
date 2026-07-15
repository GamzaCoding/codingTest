import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) count++;
                }
            }
        }
        return count;
    }
    
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

/**
3개의 숫자를 더해서 나올 수 있는 모든 수에 대한 리스트를 만들고
그 값들 중 소수가 있는지 판별해야한다.
*/