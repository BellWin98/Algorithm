import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (flag[i] == true){
                for (int j = 0; j < arr[i] * 2; j++){
                    numberList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++){
                    numberList.remove(numberList.size() - 1);
                }
            }
        }
        int[] answer = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++){
            answer[i] = numberList.get(i);
        }
        return answer;
    }
}