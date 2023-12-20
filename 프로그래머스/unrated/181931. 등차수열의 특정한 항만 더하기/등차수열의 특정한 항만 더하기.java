import java.util.*;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        List<Integer> numberList = new ArrayList<>();
        int answer = 0;
        for (int i = 0; i < included.length; i++){
            numberList.add(a);
            a = a + d;
        }
        for (int i = 0; i < included.length; i++){
            if (included[i]){
                answer += numberList.get(i);
            }
        }
        return answer;
    }
}