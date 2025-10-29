import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] plane = new int[N][2];
        for (int i = 0; i < plane.length; i++) {
            st = new StringTokenizer(br.readLine());
            plane[i][0] = Integer.parseInt(st.nextToken());
            plane[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(plane, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        for (int[] arr : plane) {
            bw.write(arr[0] + " " + arr[1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}