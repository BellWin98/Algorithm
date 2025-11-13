import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }
        int idx = al.size() - 1;
        int count = 0;
        while (K > 0) {
            int coin = al.get(idx);
            if (coin > K) {
                idx--;
                continue;
            }
            K -= coin;
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}