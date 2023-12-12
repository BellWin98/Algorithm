import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<>();
        while (n >= 1){
            if (n == 1){
                answerList.add(n);
                break;
            }
            answerList.add(n);
            if (n % 2 == 0){
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}