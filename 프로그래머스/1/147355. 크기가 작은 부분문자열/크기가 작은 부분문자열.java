import java.util.*;

class Solution {
    public int solution(String t, String p) {
        List<Long> numberList = new ArrayList<>();
        long long_p = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++){
            numberList.add(Long.parseLong(t.substring(i, i + p.length())));
        }
        for (long number : numberList){
            if (number <= long_p){
                answer++;
            }
        }
        return answer;
    }
}