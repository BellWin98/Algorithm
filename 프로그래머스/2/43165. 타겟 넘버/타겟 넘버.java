import java.util.*;

class Solution {
    
    static List<Integer> result = new ArrayList<>();
    
    public int solution(int[] numbers, int target) {
        
        recursive(numbers, 0, 0);
        
        int answer = 0;
        for (int sum : result) {
            if (target == sum) {
                answer++;
            }
        }
        
        return answer;
        
    }
    
    public void recursive(int[] numbers, int currentIdx, int currentSum) {
        
        if (currentIdx == numbers.length) {
            result.add(currentSum);
            return;
        }
        
        recursive(numbers, currentIdx + 1, currentSum + numbers[currentIdx]);
        recursive(numbers, currentIdx + 1, currentSum - numbers[currentIdx]);
    }
}