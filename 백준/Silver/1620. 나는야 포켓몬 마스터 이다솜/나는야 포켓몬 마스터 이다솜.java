import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> nameBasedHm = new HashMap<>();
        Map<Integer, String> numberBasedHm = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int number = 1;
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            nameBasedHm.put(name, number);
            numberBasedHm.put(number, name);
            number++;
        }
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if (Character.isDigit(c)) {
                bw.write(numberBasedHm.get(Integer.parseInt(str)) + "\n");
            } else {
                bw.write(nameBasedHm.get(str) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}