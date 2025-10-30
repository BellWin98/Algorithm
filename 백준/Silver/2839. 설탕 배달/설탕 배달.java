import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int answer = 0;
        if (N % 5 == 0) {
            answer = N / 5;
            N = 0;
        }
        while (N >= 3) {
            N -= 3;
            answer++;
            if (N % 5 == 0) {
                answer += N / 5;
                N = 0;
            }
        }
        if (N > 0) {
            answer = -1;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}