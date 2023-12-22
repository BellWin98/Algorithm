import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> numberList = new ArrayList<>();
        for (String str : intStrs){
            String temp = str.substring(s, s + l);
            if (Integer.parseInt(temp) > k){
                numberList.add(Integer.parseInt(temp));
            }
        }
        int[] answer = new int[numberList.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = numberList.get(i);
        }
        return answer;
    }
}