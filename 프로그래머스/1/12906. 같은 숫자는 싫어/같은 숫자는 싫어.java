import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> numberDeque = new ArrayDeque<>();
        for (int number : arr){
            if (numberDeque.isEmpty()){
                numberDeque.addLast(number);    
            } else {
                if (numberDeque.peekLast() != number){
                    numberDeque.addLast(number);
                }
            }
        }
        int[] answer = new int[numberDeque.size()];
        int i = 0;
        while (!numberDeque.isEmpty()){
            answer[i++] = numberDeque.pollFirst();
        }
        
        return answer;
    }
}