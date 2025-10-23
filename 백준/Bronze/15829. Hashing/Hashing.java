import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < str.length(); i++) {
            int charNum = (int) str.charAt(i) - 96;
            sum = sum.add(BigInteger.valueOf(31).pow(i).multiply(BigInteger.valueOf(charNum)));
        }
        bw.write(sum.mod(BigInteger.valueOf(1234567891)) + "\n");
        bw.flush();
        bw.close();
    }
}