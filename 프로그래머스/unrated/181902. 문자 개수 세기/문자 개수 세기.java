import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] charArr = my_string.toCharArray();
        for (char c : charArr){
            if (c >= 'A' && c <= 'Z'){
                answer[c - 65]++;
            } else {
                answer[c - 71]++;
            }
        }
        return answer;
    }
}