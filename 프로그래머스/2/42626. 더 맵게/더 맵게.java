import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int count = 0;
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int number : scoville){
            minHeap.add(number);
        }
        if (minHeap.peek() >= K){
            return count;
        }
        while (minHeap.peek() < K && minHeap.size() > 1){
            int value = minHeap.poll();
            minHeap.add(value + (minHeap.poll() * 2));
            count++;
        }
        return minHeap.peek() >= K ? count : -1; 
    }
}