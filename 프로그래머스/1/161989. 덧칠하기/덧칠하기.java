class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int paintedUtil = 0;

        for (int current : section) {
            if (current > paintedUtil) {
                count++;
                paintedUtil = current + m - 1;
            }
        }
        return count;
    }
}