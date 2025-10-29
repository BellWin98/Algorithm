import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> hm = new HashMap<>();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            hm.put(st.nextToken(), 1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        while (st.hasMoreTokens()) {
            int answer = hm.getOrDefault(st.nextToken(), 0) > 0 ? 1 : 0;
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}