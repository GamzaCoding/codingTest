import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        Map<String, Integer> nameScore = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            nameScore.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String picName : photo[i]) {
                sum += nameScore.getOrDefault(picName, 0);
            }
            result[i] = sum;
        }
        
        return result;
    }
}

/**
name(key), yearning(value)을 map으로 만든다.
photo를 순환하면서 각 포토의 name(key)을 (yearning)value로 변환한다.
 만약, key가 없다면 0으로 변환시킨다.
 모두 더한다

*/