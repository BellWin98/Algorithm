import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> tm = new HashMap<>();
        for (int i = 0; i < N; i++) {
            tm.put(br.readLine(), 1);
        }
        List<String> al = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String key = br.readLine();
            if (tm.containsKey(key)) {
                al.add(key);
            }
        }
        br.close();
        bw.write(al.size() + "\n");
        Collections.sort(al);
        for (String key : al) {
            bw.write(key + "\n");
        }
        bw.flush();
        bw.close();
    }
}