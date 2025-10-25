import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] countingArr = new int[10001];
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            countingArr[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for (int i = 1; i < countingArr.length; i++) {
            while (countingArr[i] > 0) {
                bw.write(i + "\n");
                countingArr[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}