import java.io.*;
import java.util.*;

public class Main {

    public static class Document {
        int idx;
        int priority;

        public Document(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Document> Q = new LinkedList<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서 갯수
            int M = Integer.parseInt(st.nextToken()); // 몇번째로 인쇄되었는지
            st = new StringTokenizer(br.readLine());
            int idx = 0;
            while (st.hasMoreTokens()) {
                Q.offer(new Document(idx++, Integer.parseInt(st.nextToken())));
            }
            int order = 0;
            while (!Q.isEmpty()) {
                Document polled = Q.poll();
                boolean bExtract = true;
                for (Document document : Q) {
                    if (polled.priority < document.priority) {
                        Q.offer(polled);
                        bExtract = false;
                        break;
                    }
                }
                if (bExtract) {
                    order++;
                    if (polled.idx == M) {
                        bw.write(order + "\n");
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
