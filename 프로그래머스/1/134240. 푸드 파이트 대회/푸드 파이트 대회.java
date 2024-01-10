import java.util.*;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(0);
        for (int i = food.length - 1; i > 0; i--){
            int n = food[i] / 2;
            while (n > 0){
                deque.addLast(i);
                deque.addFirst(i);
                n--;
            }
        }
        while (!deque.isEmpty()){
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}