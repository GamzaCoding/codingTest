class Solution {
    // 상, 좌, 우, 하
    private static final int[] dy = {-1, 0, 0, 1};
    private static final int[] dx = {0, -1, 1, 0};

    private boolean isNearPerson(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;
            if (room[ny][nx] == 'P') return true;
        }
        return false;
    }

    private boolean isInValidPosition(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) continue;

            switch (room[ny][nx]) {
                case 'P' : return true;
                case 'O' :
                    if (isNearPerson(room, nx, ny, opposite(d))) return true;
                    break;
            }
        }
        return false;
    }

    // 반대편 방향을 나타낸다
    private int opposite(int d) {
        return switch (d) {
            case 0 -> 3; // 상 -> 하
            case 1 -> 2; // 좌 -> 우
            case 2 -> 1; // 우 -> 좌
            case 3 -> 0; // 하 -> 상
            default -> -1;
        };

    }

    private boolean isValidRoom(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room.length; x++) {
                if (room[y][x] != 'P') continue;
                if (isInValidPosition(room, x, y)) return false;
            }
        }
        return true;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for (int i = 0; i < places.length; i++) {
            Room room = new Room(places[i]);

            if (isValidRoom(room.getRoom())) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    static class Room {
        private final char[][] room;

        public Room(String[] place) {
            char[][] resultRoom = new char[place.length][];
            for (int i = 0; i < place.length; i++) {
                resultRoom[i] = place[i].toCharArray();
            }
            this.room = resultRoom;
        }

        public char[][] getRoom() {
            return room;
        }
    }
}
