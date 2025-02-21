import java.util.Arrays;

class Solution {
    public long solution(int a, int b) {
        int[] arr = new int[]{a,b};
        long answer = 0;
        Arrays.sort(arr);
        for (int i = arr[0]; i <= arr[1]; i++) {
            answer += i;
        }

        return answer;
    }
}