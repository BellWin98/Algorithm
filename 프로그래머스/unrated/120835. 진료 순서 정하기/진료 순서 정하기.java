import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] result = new int[emergency.length];
        int[] desc = Arrays.stream(emergency)
            .boxed()
            .sorted(Comparator.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        for (int i = 0; i < emergency.length; i++){
            for (int j = 0; j < desc.length; j++){
                if (emergency[i] == desc[j]) {
                    result[i] = j + 1;
                    break;
                } 
            }
        }
        
        return result;
    }
}