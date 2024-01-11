class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0; // 받을 수 있는 콜라 병의 개수
        while (n >= a){
            int coke = (n / a) * b;
            answer += coke;
            n = (n % a) + coke;
        }
        return answer;
    }
}