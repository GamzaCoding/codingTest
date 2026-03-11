class Solution {
    public int[] solution(int n) {
        int[] dx = {0, 1, -1};
        int[] dy = {1, 0, -1};
        
        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int directionChangeIndex = 0;
        int value = 1;
        
        while(true) {
            triangle[y][x] = value++;
            int nextX = x + dx[directionChangeIndex];
            int nextY = y + dy[directionChangeIndex];
            
            // 방향 변화 감지
            if (nextY == n || nextX == n || nextY == -1 || nextX == -1 || triangle[nextY][nextX] != 0) {
                directionChangeIndex = (directionChangeIndex + 1) % 3;
                nextX = x + dx[directionChangeIndex];
                nextY = y + dy[directionChangeIndex];
                // 최종 감지
                if (nextY == n || nextX == n || nextY == -1 || nextX == -1 || triangle[nextY][nextX] != 0) {
                    break;
                }
            }
            
            x = nextX;
            y = nextY;
        }
        
        int[] result = new int[value-1];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (triangle[i][j] != 0) {
                    result[index++] = triangle[i][j];
                }
            }
        }
        
        return result;
    }
}