import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> numList = new ArrayList<>();
        int count = 1;
        for (int i = k; i <= n; i = i + k){
            numList.add(i);
        }
        
        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = numList.get(i);
        }
        
        return answer;
    }
}