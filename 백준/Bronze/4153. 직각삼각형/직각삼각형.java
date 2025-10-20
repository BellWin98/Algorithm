import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        while (a != 0 && b != 0 && c != 0){
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;
            Arrays.sort(arr);
            bw.write(((arr[0] * arr[0]) + (arr[1] * arr[1]) == arr[2] * arr[2] ? "right" : "wrong") + "\n");
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }
        bw.flush();
        bw.close();
    }
}