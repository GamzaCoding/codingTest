class Solution {
    public int solution(int n) {
        String threeStr = Integer.toString(n, 3);
        String reversed = new StringBuilder(threeStr).reverse().toString();
        return Integer.parseInt(reversed, 3);
    }
}