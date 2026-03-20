class Solution {
    public boolean solution(int x) {
        String[] xArr = String.valueOf(x).split("");
        int sum = 0;
        
        for (String number : xArr){
            sum += Integer.parseInt(number);
        }
    
        if (x % sum == 0){
            return true;
        }
    
        return false;
    }
}