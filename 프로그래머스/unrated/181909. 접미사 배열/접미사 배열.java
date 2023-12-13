import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = my_string.length() - 1; i >= 0; i--){
            answer[my_string.length() - 1 - i] = my_string.substring(i, my_string.length());
        }
        Arrays.sort(answer);
        return answer;
    }
}