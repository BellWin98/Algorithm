import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = i;
        }
        int count = 1;
        int start = 0;
        int end = 0;
        int sum = 1;
        while (arr[start]+arr[end] <= N) {
            if (sum == N) {
                count++;
                sum -= arr[start];
                start++;
            }
            if (sum + arr[end + 1]> N) {
                sum -= arr[start];
                start++;
                continue;
            }
            end++;
            sum += arr[end];
        }
        System.out.println(count);
    }
}