import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> Q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int count = 1;
        while (!Q.isEmpty()) {
            if (count == K) {
                sb.append(Q.poll());
                if (!Q.isEmpty()) {
                    sb.append(", ");
                    count = 1;
                }
            } else {
                Q.offer(Q.poll());
                count++;
            }
        }
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
