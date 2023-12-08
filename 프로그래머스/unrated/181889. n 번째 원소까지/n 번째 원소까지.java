import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            answerList.add(num_list[i]);
        }
        return answerList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}