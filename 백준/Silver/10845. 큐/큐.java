import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.contains(" ")) {
                String[] strArr = str.split(" ");
                dq.offer(Integer.parseInt(strArr[1]));
            } else if (str.equals("pop")) {
                bw.write(dq.isEmpty() ? "-1\n" : dq.poll() + "\n");
            } else if (str.equals("size")) {
                bw.write(dq.size() + "\n");
            } else if (str.equals("empty")) {
                bw.write(dq.isEmpty() ? "1\n" : "0\n");
            } else if (str.equals("front")) {
                bw.write(dq.isEmpty() ? "-1\n" : dq.peekFirst() + "\n");
            } else {
                bw.write(dq.isEmpty() ? "-1\n" : dq.peekLast() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}