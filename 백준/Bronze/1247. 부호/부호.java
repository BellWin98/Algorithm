import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            int T = Integer.parseInt(br.readLine());
            BigInteger S = BigInteger.ZERO;
            for (int k = 0; k < T; k++) {
                BigInteger number = new BigInteger(br.readLine());
                S = S.add(number);
            }
            bw.write((S.equals(BigInteger.ZERO) ? "0" : S.compareTo(BigInteger.ZERO) > 0 ? "+" : "-") + "\n");
        }
        bw.flush();
        bw.close();
    }
}