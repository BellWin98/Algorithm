import java.lang.Math;

class Solution {
    public int[] solution(int n) {
        if (n % 2 != 0){
            n = n / 2 + 1;
        } else {
            n = n / 2;
        }
        int[] answer = new int[n];
        int k = 1;
        for (int i = 0; i < answer.length; i++){
            if (k % 2 != 0){
                answer[i] = k;
            }
            k = k + 2;
        }
        return answer;
    }
}