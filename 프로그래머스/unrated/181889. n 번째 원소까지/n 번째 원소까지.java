import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // 내 풀이
        // List<Integer> answerList = new ArrayList<>();
        // for (int i = 0; i < n; i++){
        //     answerList.add(num_list[i]);
        // }
        // return answerList.stream()
        //     .mapToInt(Integer::intValue)
        //     .toArray();
        
        // 다른 사람 풀이 1
        // int[] answer = new int[n];
        // for (int i = 0; i < answer.length; i++){
        //     answer[i] = num_list[i];
        // }
        // return answer;
        
        // 다른 사람 풀이 2
        return Arrays.copyOfRange(num_list, 0, n);
        
    }
}