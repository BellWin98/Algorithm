class Solution {
    public int solution(int n, int t) {
        for (int i = 0; i < t; i++){
            n *= 2;
        }
        return n;
    }
}



        // int answer = n;
        // for (int i = 0; i < t; i++){
        //     answer *= 2;
        // }
        // return answer;