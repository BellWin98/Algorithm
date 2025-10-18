import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int key = num % 42;
            hm.put(num % 42, hm.getOrDefault(key, 0) + 1);
        }
        bw.write(hm.keySet().size() +"\n");
        bw.flush();
        bw.close();
    }
}