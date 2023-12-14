class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int number = i; number <= j; number++){
            String strNumber = String.valueOf(number);
            for (char c : strNumber.toCharArray()){
                if (Character.getNumericValue(c) == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}