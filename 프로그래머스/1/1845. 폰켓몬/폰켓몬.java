import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        return Math.min(hm.size(), nums.length / 2);
    }
}