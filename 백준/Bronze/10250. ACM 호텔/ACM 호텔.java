import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int floor;
            String roomNumber;
            int quotient = N / H;
            int remainder = N % H;
            if (remainder == 0) {
                floor = H;
            } else {
                floor = remainder;
                quotient += 1;
            }
            if (quotient < 10) {
                roomNumber = "0" + quotient;
            } else {
                roomNumber = String.valueOf(quotient);
            }
            bw.write(floor + roomNumber + "\n");
        }
        bw.flush();
        bw.close();
    }
}