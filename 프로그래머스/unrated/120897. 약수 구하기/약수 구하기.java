import java.util.*;

class Solution {
    public int[] solution(int n) {
                
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                numberList.add(i);
            }
        }
        
        int[] answer = new int[numberList.size()];
        
        for (int i = 0; i < answer.length; i++){
            answer[i] = numberList.get(i);    
        }

        return answer;
    }
}