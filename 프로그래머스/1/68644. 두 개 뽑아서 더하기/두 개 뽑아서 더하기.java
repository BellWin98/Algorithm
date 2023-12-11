import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] temp = new int[numbers.length * (numbers.length - 1) / 2];
        int[] answer = new int[numbers.length * (numbers.length - 1) / 2];
        int index = 0;
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                temp[index] = numbers[i] + numbers[j];
                index++;
            }
        }
        Arrays.sort(temp);
        
        for (int i = 0; i < answer.length - 1; i++){
            if (temp[i] != temp[i + 1]){
                answer[count] = temp[i];
                count++;
            }
        }
        answer[count] = temp[temp.length - 1];
        answer = Arrays.copyOfRange(answer, 0, count + 1);
        return answer;
    }
}