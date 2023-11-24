class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenCount = 0;
        int oddCount = 0;
        for (int number : num_list){
            if (number % 2 == 0){
                evenCount++;
                continue;
            }
            oddCount++;
        }
        answer[0] = evenCount;
        answer[1] = oddCount;
        return answer;
    }
}