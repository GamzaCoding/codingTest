class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        // 명함은 회전이 가능함으로, 가장 큰 길이를 가로로, 작은 길이를 세로로 고정.
        for (int[] card : sizes) {
            int width = Math.max(card[1], card[0]);
            int height = Math.min(card[1], card[0]);
            
            maxWidth = Math.max(maxWidth, width);
            maxHeight = Math.max(maxHeight, height);
        }
        
        return maxWidth * maxHeight;
    }
}