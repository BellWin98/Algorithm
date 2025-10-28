import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] counting = new boolean[2000001];
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            counting[Integer.parseInt(br.readLine()) + 1000000] = true;
        }
        br.close();
        for (int i = 0; i < counting.length; i++) {
            if (counting[i]) {
                bw.write(i - 1000000 +"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}