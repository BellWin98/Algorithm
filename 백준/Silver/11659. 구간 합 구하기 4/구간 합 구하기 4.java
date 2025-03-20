import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        int[] S = new int[N];
        st = new StringTokenizer(br.readLine());
        A[0] = Integer.parseInt(st.nextToken());
        S[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());;
            S[i] = S[i - 1] + A[i];
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            if (start <= 0) {
                System.out.println(S[end]);
                continue;
            } else if (start == end) {
                System.out.println(A[start]);
                continue;
            }
            System.out.println(S[end] - S[start - 1]);
        }
    }
}