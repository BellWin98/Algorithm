import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 0; i <= 10; i++){
            if (arr.length <= Math.pow(2, i)){
                int count = (int) Math.pow(2, i) - arr.length;
                for (int j = 0; j < count; j++){
                    numList.add(0);
                }
                break;
            }
        }
        return numList.stream().mapToInt(a -> a).toArray();
    }
}