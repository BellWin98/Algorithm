import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int number : numbers){
            deque.offerLast(number);
        }
        // k - 1번째까지 요소를 2개씩 poll 후, 뒤에 재삽입
        for (int i = 0; i < k - 1; i++){
            deque.offerLast(deque.pollFirst());
            deque.offerLast(deque.pollFirst());
        }
        // 덱의 가장 첫 번째 요소가 k번째로 공을 던지는 사람 
        return deque.peekFirst();
    }
}