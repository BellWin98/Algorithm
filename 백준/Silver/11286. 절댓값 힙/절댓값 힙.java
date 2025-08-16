import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x > 0) {
                minHeap.add(x);
            } else if (x < 0){
                maxHeap.add(x);
            } else { // x가 0일 때
                if (minHeap.peek() == null && maxHeap.peek() == null) {
                    System.out.println(0);
                } else if (minHeap.peek() == null && maxHeap.peek() != null) {
                    System.out.println(maxHeap.poll());
                } else if (minHeap.peek() != null && maxHeap.peek() == null) {
                    System.out.println(minHeap.poll());
                } else if (minHeap.peek() != null && maxHeap.peek() != null) {
                    if (minHeap.peek() + maxHeap.peek() == 0) {
                        System.out.println(maxHeap.poll());
                    } else {
                        if (Math.abs(maxHeap.peek()) > minHeap.peek()) {
                            System.out.println(minHeap.poll());
                        } else {
                            System.out.println(maxHeap.poll());
                        }
                    }
                }
            }
        }
    }
}
