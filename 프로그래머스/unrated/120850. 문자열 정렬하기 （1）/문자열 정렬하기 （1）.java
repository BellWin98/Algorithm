import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> result_list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                result_list.add(ch -'0');
            }
        }
        
        int len = result_list.size();
        int[] result_arr = new int[len];
        for (int i = 0; i < len; i++){
            result_arr[i] = result_list.get(i);
        }
        
        Arrays.sort(result_arr);
        
        return result_arr;
    }
}