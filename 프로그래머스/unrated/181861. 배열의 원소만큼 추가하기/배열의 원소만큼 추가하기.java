import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++){
            int value = arr[i];
            while (value > 0){
                numList.add(arr[i]);
                value--;
            }
        }
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}