import java.io.*;

public class Main {
    static Integer[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dp = new Integer[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        int T = Integer.parseInt(br.readLine());
        while (T --> 0) {
            int N = Integer.parseInt(br.readLine());
            bw.write(fibo(N)[0] + " " + fibo(N)[1] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static Integer[] fibo(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibo(n - 1)[0] + fibo(n - 2)[0];
            dp[n][1] = fibo(n - 1)[1] + fibo(n - 2)[1];
        }
        return dp[n];
    }
}