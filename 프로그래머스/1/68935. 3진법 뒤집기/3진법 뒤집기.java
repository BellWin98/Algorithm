import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> numberList = new ArrayList<>();
        int multiple = 1;
        int answer = 0;
        while (n > 0){
            numberList.add(n % 3);
            n = n / 3;
        }
        for (int i = numberList.size() - 1; i >= 0; i--){
            answer = answer + (numberList.get(i) * multiple);
            multiple = multiple * 3;
        }
        return answer;
    }
}