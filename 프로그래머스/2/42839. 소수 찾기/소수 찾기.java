
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String givenNumbers) {
        Set<Integer> primes = new HashSet<>();
        int[] numbers = givenNumbers.chars().map(c -> c - '0').toArray();
        getPrime(0, numbers, new boolean[numbers.length], primes);
        
        return primes.size();
    }
    
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    private void getPrime(int mkNum, int[] numbers, boolean[] isUsed, Set<Integer> primes) {
        if (isPrime(mkNum)) {
            primes.add(mkNum);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;
            
            int nextMkNum = mkNum * 10 + numbers[i];
            isUsed[i] = true;
            getPrime(nextMkNum, numbers, isUsed, primes);
            isUsed[i] = false;
        }
        
    }
}