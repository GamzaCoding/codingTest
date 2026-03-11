class Solution {
    public int[] solution(int n) {
        TriangleBoard board = new TriangleBoard(n);
        Direction direction = new Direction();
        Point current = new Point(0, 0);
        
        while(true) {
            board.fill(current);
            
            if (!board.canMove(current, direction)) {
                direction.changeDirection();
                if (!board.canMove(current, direction)) {
                    break;
                }
            }
            current = current.move(direction);
        }
        
        return board.flatten();
    }
    
    private class TriangleBoard {
        private final int[][] board;
        private int nextValue = 1;
        
        public TriangleBoard(int n) {
            this.board = new int[n][n];
        }
        
        public void fill(Point point) {
            board[point.getY()][point.getX()] = nextValue++;
        }
        
        public boolean canMove(Point current, Direction direction) {
            Point next = current.move(direction);
            int x = next.getX();
            int y = next.getY();
            
            return isInRange(x, y) && board[y][x] == 0;
        }
        
        private boolean isInRange(int x, int y) {
            return x >= 0 && y >= 0 && x < board.length && y < board.length;
        }
        
        public int[] flatten() {
            int[] result = new int[nextValue -1];
            int index = 0;
            
            for (int y = 0; y < board.length; y++) {
                for (int x = 0; x < board.length; x++) {
                    if (board[y][x] != 0) {
                        result[index++] = board[y][x];
                    }
                }
            }
            
            return result;
        }
    } 
    
    private class Point {
        private final int x;
        private final int y;
        
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point move(Direction direction) {
            return new Point(x + direction.getDx(), y + direction.getDy());
        }
        
        public int getX() {
            return x;
        }
        
       public int getY() {
            return y;
        }
    }
    
    private class Direction {
        // 아래, 오른쪽, 왼쪽위
        private int[] dx = {0, 1, -1};
        private int[] dy = {1, 0, -1};
        private int directionIndex = 0;
        
        public void changeDirection() {
            directionIndex = (directionIndex + 1) % 3;
        }
        
        public int getDx() {
            return dx[directionIndex];
        }
        
        public int getDy() {
            return dy[directionIndex];
        }
    }
}