import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        List<String> cards1List = new ArrayList<>(Arrays.asList(cards1));
        List<String> cards2List = new ArrayList<>(Arrays.asList(cards2));
        int count = 0;

        for (int i = 0; i < goal.length; i++) {
            
            if (!cards1List.isEmpty() && goal[i].equals(cards1List.get(0))) {
                cards1List.remove(0);
                count++;
            } else if (!cards2List.isEmpty() && goal[i].equals(cards2List.get(0))) {
                cards2List.remove(0);
                count++;
            }
        }
        
        if (goal.length == count) {
            return "Yes";
        } else {
            return "No";
        }
    }
}