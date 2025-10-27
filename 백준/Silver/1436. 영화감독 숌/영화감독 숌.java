import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int target = 666;
        int i = 0;
        while (i < N) {
            if (String.valueOf(target).contains("666")) {
                i++;
            }
            target++;
        }
        bw.write(target - 1 + "\n");
        bw.flush();
        bw.close();
    }
}