import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> hm = new LinkedHashMap<>();
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < 10; i++) {
            hm.put(i, 0);
        }
        for (char c : String.valueOf(A * B * C).toCharArray()) {
            int key = Integer.parseInt(String.valueOf(c));
            hm.put(key, hm.get(key) + 1);
        }
        for (int i = 0; i < 10; i++) {
            bw.write(hm.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}