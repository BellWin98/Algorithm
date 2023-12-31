import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            return new int[]{-1};
        }
        // Stream 풀이
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(a -> a != min).toArray();
    }
}

// 내 풀이
// List<Integer> numList = Arrays.stream(arr).boxed().collect(Collectors.toList());
// int min = numList.get(0);
// for (int i = 1; i < numList.size(); i++){
//     if (numList.get(i) < min){
//         min = numList.get(i);
//     }
// }
// numList.remove(Integer.valueOf(min));
// return numList.stream().mapToInt(a -> a).toArray();