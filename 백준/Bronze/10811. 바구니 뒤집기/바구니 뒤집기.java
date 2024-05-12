import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] buckets;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        buckets = new int[N];

        // 바구니 번호가 1부터 시작이므로 인덱스 + 1
        for (int i = 0; i < N; i++){
            buckets[i] = i + 1;
        }

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken()) - 1;
            int endIndex = Integer.parseInt(st.nextToken()) - 1;
            int length = (endIndex - startIndex) % 2 == 0 ? (endIndex - startIndex) / 2 : (endIndex - startIndex) / 2 + 1;

            // 인덱스 구간 역순 정렬
            for (int j = 0; j < length; j++){
                swap(startIndex, endIndex);
                startIndex++;
                endIndex--;
            }
        }

        for (int bucket : buckets) {
            sb.append(bucket).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    public static void swap(int bucket1, int bucket2){
        int temp = buckets[bucket1];
        buckets[bucket1] = buckets[bucket2];
        buckets[bucket2] = temp;
    }
}