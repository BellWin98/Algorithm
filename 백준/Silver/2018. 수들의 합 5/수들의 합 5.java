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
            if (sum > N) {
                sum -= arr[start++];
            } else if (sum < N) {
                sum += arr[++end];
            } else {
                sum += arr[++end];
                count++;
            }
        }
        System.out.println(count);
    }
}