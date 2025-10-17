import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Double> hm = new HashMap<>();
        hm.put("A+", 4.3);
        hm.put("A0", 4.0);
        hm.put("A-", 3.7);
        hm.put("B+", 3.3);
        hm.put("B0", 3.0);
        hm.put("B-", 2.7);
        hm.put("C+", 2.3);
        hm.put("C0", 2.0);
        hm.put("C-", 1.7);
        hm.put("D+", 1.3);
        hm.put("D0", 1.0);
        hm.put("D-", 0.7);
        hm.put("F", 0.0);
        bw.write(String.valueOf(hm.get(br.readLine())));
        bw.flush();
        bw.close();
    }
}