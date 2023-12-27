import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            if (stkList.isEmpty()){
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size() - 1) < arr[i]){
                stkList.add(arr[i]);
                i++;
            } else if (stkList.get(stkList.size() - 1) >= arr[i]){
                stkList.remove(stkList.size() - 1);
            }
        }
        return stkList.stream().mapToInt(a -> a).toArray();
    }
}