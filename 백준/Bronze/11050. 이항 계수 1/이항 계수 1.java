import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int numerator = 1; // 분자
        int denominator = 1; // 분모
        for (int i = 1; i <= N; i++) {
            numerator *= i;
        }
        for (int i = 1; i <= K; i++) {
            denominator *= i;
        }
        for (int i = 1; i <= N - K; i++) {
            denominator *= i;
        }
        bw.write(numerator / denominator + "\n");
        bw.flush();
        bw.close();
    }
}