import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int divisor = 2;
        int gcd = 1;

        while (divisor <= N && divisor <= M) {
            if (N % divisor == 0 && M % divisor == 0) {
                gcd *= divisor;
                N /= divisor;
                M /= divisor;
            } else {
                divisor++;
            }
        }
        int lcm = gcd * N * M;
        bw.write(gcd + "\n" + lcm);
        bw.flush();
        bw.close();
    }
}