import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1; 
        String[] answer = new String[len];
        int idx = 0;
        for (int i = 0; i < my_str.length(); i = i + n){
            if (i + n > my_str.length() - 1){
                answer[idx++] = my_str.substring(i, my_str.length());
                break;
            }
            answer[idx++] = my_str.substring(i, i + n);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}