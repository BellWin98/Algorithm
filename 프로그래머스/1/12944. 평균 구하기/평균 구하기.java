class Solution {
    public double solution(int[] arr) {
        double answer = 0.0;
        for (int number : arr) {
            answer += number;
        }
        return answer / arr.length;
    }
}