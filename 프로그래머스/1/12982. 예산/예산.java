import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int total = Arrays.stream(d).sum();
        int answer = 0;
        int sum = 0;
        if (total <= budget){
            return d.length;
        }
        Arrays.sort(d);
        for (int number : d){
            sum += number;
            if (sum > budget){
                break;
            }
            answer++;
        }
        return answer;
    }
}

