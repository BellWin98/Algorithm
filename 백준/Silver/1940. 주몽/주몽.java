import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int[] resources = new int[N];
        for (int i = 0; i < N; i++) {
            int resource = Integer.parseInt(st.nextToken());
            resources[i] = resource;
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (resources[i] + resources[j] == M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
