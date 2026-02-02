import java.io.*;

/**
 * https://www.acmicpc.net/problem/2581
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if (i == 1) {
                continue;
            }
            if (isPrime(i)) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum > 0) {
            bw.write(sum + "\n" + min);
        } else {
            bw.write(-1 + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
