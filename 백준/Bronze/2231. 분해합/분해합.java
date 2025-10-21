import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            int sum = i;
            for (char c : String.valueOf(i).toCharArray()) {
                sum += Character.getNumericValue(c);
            }
            if (sum == N) {
                bw.write(i + "\n");
                bw.flush();
                bw.close();
                return;
            }
        }
        bw.write("0");
        bw.flush();
        bw.close();
    }
}