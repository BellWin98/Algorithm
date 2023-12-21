class Solution {
    public int solution(int num) {
        long newNum = num;
        int answer = 0;
        if (newNum == 1){
            return 0;
        }
        while (answer <= 500){
            if (newNum == 1){
                return answer;
            }
            if (newNum % 2 == 0){
                newNum /= 2;
            } else {
                newNum = newNum * 3 + 1;
            }
            answer++;
        }
        return -1;
    }
}