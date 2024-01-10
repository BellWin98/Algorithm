import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands){
            List<Integer> numbers = new ArrayList<>();
            for (int i = command[0] - 1; i < command[1]; i++){
                numbers.add(array[i]);
            }
            Collections.sort(numbers);
            answer[index++] = numbers.get(command[2] - 1);
        }
        return answer;
    }
}