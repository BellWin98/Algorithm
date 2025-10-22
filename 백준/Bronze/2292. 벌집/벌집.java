import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int i = 1;
        while (num < N) {
            num += 6 * i++;
        }
        bw.write(i + "\n");
        bw.flush();
        bw.close();
    }
}