import java.util.*;

class Solution {
    static int answer = 0;
    static int count = 0;
    public int solution(int balls, int share) {
        combination(0, balls, share);
        return answer;
    }
    static void combination(int start, int balls, int share) {
        if (count == share){
            answer++;
            return;
        }
        for (int i = start; i < balls; i++){
            count++;
            combination(i + 1, balls, share);
            count--;
        }
    }
}