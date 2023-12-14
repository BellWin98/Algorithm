class Solution {
    public int solution(int n) {
        int number = 1; // 곱해지는 변수
        int answer = 1; // 연산 카운트 변수 (result)
        while (number * answer < n){
            answer++;
            number *= answer;
        }
        return answer;
    }
}