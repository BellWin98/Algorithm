import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> hm = new HashMap<>();
        String S = br.readLine();
        int idx = 0;
        for (char c : S.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, idx++));
        }
        for (int i = 97; i <= 122; i++) {
            sb.append(hm.getOrDefault((char) i, -1)).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}