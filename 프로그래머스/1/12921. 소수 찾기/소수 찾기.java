class Solution {
    public int solution(int n) {
        boolean[] isNotPrime = new boolean[n + 1];
        
        // 0과 1은 소수가 아니다.
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        // i의 배수들은 소수가 아닌 수로 표시한다.
        for (int i = 2; i * i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        
        int count = 0;
        
        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                count++;
            }
        }
        return count;
    }
}

/**
가장 효율적인 방법은 '아라토스테네스의 체'를 사용하는 것이다.
*/