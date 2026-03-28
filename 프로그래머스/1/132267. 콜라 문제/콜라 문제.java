class Solution {
    public int solution(int a, int b, int n) {
        
        int mine = n;
        int result = 0;
        
        while (mine >= a) {
            int value = (mine / a) * b;
            int rest = mine % a;
            
            result = result + value;
            mine = value + rest;
        }
        
        return result;
    }
}