import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> multiples = new ArrayList<>();
        for (int number : numlist){
            if (number % n == 0){
                multiples.add(number);
            }
        }
        int[] answer = new int[multiples.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = multiples.get(i);
        }
        return answer;
    }
}