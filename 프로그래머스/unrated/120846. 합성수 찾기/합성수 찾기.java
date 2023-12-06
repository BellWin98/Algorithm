class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            int factorCount = 0; // 약수 개수 카운트
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    factorCount++;
                }
            }
            if (factorCount >= 3){
                answer++; // 합성수 개수 카운트
            }
        }
        return answer;
    }
}