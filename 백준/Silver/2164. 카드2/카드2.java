import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }
        int answer = 0;
        while (!dq.isEmpty()) {
            answer = dq.poll();
            if (dq.peek() != null) {
                dq.addLast(dq.poll());
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}