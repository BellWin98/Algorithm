import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] shirts = new int[6];
        int i = 0;
        while (st.hasMoreTokens()) {
            shirts[i++] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int tBundles = 0;
        int pBundles = N / P;
        int pCount = N % P;
        for (int shirt : shirts) {
            if (shirt == 0) continue;
            if (T < shirt) {
                tBundles += shirt % T == 0 ? shirt / T : (shirt / T) + 1;
            } else {
                tBundles++;
            }
        }
        bw.write(tBundles + "\n" + pBundles +" " + pCount);
        bw.flush();
        bw.close();
    }
}