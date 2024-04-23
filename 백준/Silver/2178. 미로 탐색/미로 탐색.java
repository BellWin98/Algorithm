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
    static int n;
    static int m;

    static class Node {
        private final int x;
        private final int y;
        private final int distance;

        Node(int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++){
            char[] sp = br.readLine().toCharArray();
            for (int j = 0; j < m; j++){
                map[i][j] = Character.getNumericValue(sp[j]);
            }
        }

        int answer = bfs(0, 0);
        System.out.println(answer);
    }

    public static int bfs(int x, int y){
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(x, y, 1));
        visited[y][x] = true;

        while (!Q.isEmpty()){
            Node target = Q.poll();
            if (target.x == m - 1 && target.y == n - 1){
                return target.distance;
            }
            for (int i = 0; i < 4; i++){
                int nx = target.x + dx[i];
                int ny = target.y + dy[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n){
                    if (map[ny][nx] == 1 && !visited[ny][nx]){
                        Q.add(new Node(nx, ny, target.distance + 1));
                        visited[ny][nx] = true;
                    }
                }
            }
        }
        return 0;
    }
}