import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++){
            numbers.add(num_list[i]);
        }
        
        int[] answer = new int[numbers.size()];
        
        for (int i = 0; i < answer.length; i++){
            answer[i] = numbers.get(i);
        }
        
        return answer;
    }
}