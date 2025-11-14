import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> hm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String address = st.nextToken();
            String password = st.nextToken();
            hm.put(address, password);
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(hm.get(st.nextToken()) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
