import java.util.*;


class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        List<Integer> honors = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            honors.add(score[i]);
            
            Collections.sort(honors); // 오름차순 정렬 {10, 20, 100}
            
            if (honors.size() > k) {
                honors.remove(0);
            }
            result[i] = honors.get(0);
        }
        return result;
    }
}

/**
    점수를 순회하면서 honors.add 한다.
    매 순회시 오름차순 정렬을 실시한다.
    만약 honors의 크기가 k보다 클경우 맨 앞에 인덱스 값을 삭제한다.
    result에 honors의 최소값을 넣는다.
*/