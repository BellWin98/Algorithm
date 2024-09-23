import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] buttons = new int[1000001];
    static boolean[] visited = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken()); // 총 층수
        int S = Integer.parseInt(st.nextToken()); // 현재 위치한 층
        int G = Integer.parseInt(st.nextToken()); // 타겟 층
        int U = Integer.parseInt(st.nextToken()); // 위로 U층 가는 버튼
        int D = Integer.parseInt(st.nextToken()); // 아래로 D층 가는 버튼

        int result = bfs(S, G, U, D, F);

        if (result < 0) {
            System.out.println("use the stairs");
        } else {
            System.out.println(result);
        }
    }

    public static int bfs(int start, int target, int up, int down, int max) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(start);
        visited[start] = true;
        buttons[start] = 0;

        while (!Q.isEmpty()) {
            int current = Q.poll();
            if (current == target) {
                return buttons[current];
            }

            int[] positions = {current + up, current - down};
            for (int next : positions) {
                if (next >= 1 && next <= max && !visited[next]) {
                    Q.add(next);
                    visited[next] = true;
                    buttons[next] = buttons[current] + 1;
                }
            }
        }

        return -1;
    }
}
