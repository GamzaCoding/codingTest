import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int boxCount = score.length / m;
        int[][] boxes = new int[boxCount][m];
        
        Arrays.sort(score);
        
        int index = score.length - 1;
        for (int[] box : boxes) {
            for (int i = 0; i < box.length; i++) {
                box[i] = score[index];
                index--;
            }
        }
        
        int result = 0;
        for (int[] box : boxes) {
            result += box[m-1] * m;
        }
        
        return result;
    }
}

// [1,1,2], [2,2,2], [4,4,4], [4,4,4] 5,5
/**
최대이익 = minApplePoint * m * boxCount
boxCount = score.length() / m

m의 크기를 가진 boxCount 수만큼의 배열을 만들고
score를 정렬한(오름차순)뒤 뒤에서 부터 수서 배열에 집어 넣으면 된다.

*/