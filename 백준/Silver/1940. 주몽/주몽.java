import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
        Arrays.sort(resources);
        int start = 0;
        int end = resources.length - 1;
        while (start < end) {
            if (resources[start] + resources[end] < M) {
                start++;
            } else if (resources[start] + resources[end] > M) {
                end--;
            } else {
                count++;
                start++;
            }
        }
        System.out.println(count);
    }
}
