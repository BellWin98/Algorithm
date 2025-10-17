import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i)).append("*".repeat(i));
            bw.write(sb + "\n");
            sb.setLength(0);
        }
        bw.flush();
        bw.close();
    }
}