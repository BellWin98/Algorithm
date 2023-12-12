import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            boolean isEqual = false; 
            for (int j = 0; j < delete_list.length; j++){
                // arr의 원소들이 delete_list의 원소와 같지 않으면 result에 삽입
                if (arr[i] == delete_list[j]){
                    isEqual = true;
                    break;
                }
            }
            if (isEqual == false){
                answerList.add(arr[i]);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}