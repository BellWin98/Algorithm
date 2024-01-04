import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> numList = new ArrayList<>();
        int[] answer = new int[k];
        int index = 0;
        for (int number : arr){
            if (numList.contains(number)){
                continue;
            }
            numList.add(number);
            answer[index++] = number;
            if (numList.size() == k){
                break;
            }
        }
        if (numList.size() < k){
            int diff = k - numList.size();
            for (int i = 0; i < diff; i++){
                answer[index++] = -1;
            }
        }
        return answer;
    }
}