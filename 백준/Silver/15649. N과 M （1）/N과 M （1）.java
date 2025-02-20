import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] sequence;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        sequence = new int[M];
        backtrack(0);
    }

    public static void backtrack(int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(sequence[i]);
                if (i < M - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = i;
                backtrack(depth + 1);
                visited[i] = false;
            }
        }
    }
}