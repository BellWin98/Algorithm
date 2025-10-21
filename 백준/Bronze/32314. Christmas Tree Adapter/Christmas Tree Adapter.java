import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ampereForTree = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int watt = Integer.parseInt(st.nextToken());
        int volt = Integer.parseInt(st.nextToken());
        int answer = watt / volt >= ampereForTree ? 1 : 0;
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}