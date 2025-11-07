import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            dq.offer(i);
        }
        int i = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!dq.isEmpty()) {
            if (i == K) {
                sb.append(dq.poll()).append(", ");
                i = 1;
            } else {
                dq.offer(dq.poll());
                i++;
            }
        }
        sb.setLength(sb.length() - 2);
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}