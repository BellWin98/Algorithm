import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N; // Y좌표
    static int M; // X좌표

    static class Node {
        int x;
        int y;
        int distance;

        Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                map[i][j] = Character.getNumericValue(chars[j]);
            }
        }

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x, int y) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(x, y, 1));

        while (!Q.isEmpty()) {
            Node current = Q.poll();
            visited[current.y][current.x] = true;

            if (current.x == M - 1 && current.y == N - 1) {
                return current.distance;
            }

            for (int i = 0; i < 4; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < M && newY < N) {
                    if (!visited[newY][newX] && map[newY][newX] == 1) {
                        Q.add(new Node(newX, newY, current.distance + 1));
                        visited[newY][newX] = true;
                    }
                }
            }
        }

        return -1;
    }
}
