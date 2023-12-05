import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int positiveMultiResult = 0;
        int negativeMultiResult = 0;
        Arrays.sort(numbers);
        positiveMultiResult = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        negativeMultiResult = numbers[0] * numbers[1];
        
        if (positiveMultiResult > negativeMultiResult){
            return positiveMultiResult;
        }
        return negativeMultiResult;
    }
}