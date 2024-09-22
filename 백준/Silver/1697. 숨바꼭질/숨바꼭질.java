import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static boolean[] visited = new boolean[100001];
    static int[] times = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        System.out.println(bfs(start, target));
    }

    public static int bfs(int start, int target) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(start);
        visited[start] = true;
        times[start] = 0;

        while (!Q.isEmpty()) {
            int current = Q.poll();

            if (current == target) {
                return times[current];
            }

            int[] positions = {current - 1, current + 1, current * 2};
            for (int next : positions) {
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    Q.add(next);
                    visited[next] = true;
                    times[next] = times[current] + 1;
                }
            }
        }

        return 0;
    }
}