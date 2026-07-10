import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        if (nums.length / 2 < set.size()) {
            return nums.length / 2;
        } else {
            return set.size();
        }
    }
}

/**
set으로 중복을 먼저 없앤다.
만약 nums/2의 크기가 set의 크기보다 작다면 return = nums/2;
만약 nums/2의 크기가 set의 크기보다 크다면 return = set.size();

*/