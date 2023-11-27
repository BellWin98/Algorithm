import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // int[] result = new int[num2];
        // int k = 0;
        // for (int i = num1; i <= num2; i++){
        //     result[k++] = numbers[i];
        // }
        // return result;
        int result[] = Arrays.copyOfRange(numbers, num1, num2+1);
        return result;
    }
}