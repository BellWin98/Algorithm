import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] buckets;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        buckets = new int[N + 1];

        for (int i = 1; i <= N; i++){
            buckets[i] = i;
        }

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int bucket1 = Integer.parseInt(st.nextToken());
            int bucket2 = Integer.parseInt(st.nextToken());
            if (bucket1 != bucket2){
                swap(bucket1, bucket2);
            }
        }

        for (int i = 1; i < buckets.length; i++){
            sb.append(buckets[i]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void swap(int bucket1, int bucket2) {
        int temp = buckets[bucket1];
        buckets[bucket1] = buckets[bucket2];
        buckets[bucket2] = temp;
    }
}