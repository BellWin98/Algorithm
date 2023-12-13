import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 강사님 풀이
        int answer = 0;
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int number : scoville){
            minHeap.add(number);
        }
        while(true){
            if (minHeap.peek() >= K){
                break;
            } else if (minHeap.size() == 1 && minHeap.peek() < K){
                answer = -1;
                break;
            } else {
                answer++;
                int temp = minHeap.poll() + minHeap.poll() * 2;
                minHeap.add(temp);
            }
        }
        return answer;
    }
}

// 내 풀이
//         int count = 0;
//         Queue<Integer> minHeap = new PriorityQueue<>();
//         for (int number : scoville){
//             minHeap.add(number);
//         }
        // 첫 데이터가 K보다 크거나 같을 때 종료
//         if (minHeap.peek() >= K){
//             return count;
//         }
//         while (minHeap.peek() < K && minHeap.size() > 1){
//             int value = minHeap.poll();
//             minHeap.add(value + (minHeap.poll() * 2));
//             count++;
//         }
        
//         return minHeap.peek() >= K ? count : -1; 