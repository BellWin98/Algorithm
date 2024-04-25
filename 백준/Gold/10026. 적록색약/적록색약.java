import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static class Node {
        private final int x;
        private final int y;

        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int N;
    static char[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean changeMode = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int good = 0; // 정상인
        int bad = 0; // 적록색약인 사람
        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++){
            char[] sp = br.readLine().toCharArray();
            for (int j = 0; j < N; j++){
                grid[i][j] = sp[j];
            }
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                // 정상인
                if (!visited[i][j]){
                    bfs(j, i);
                    good++;
                }
            }
        }
        // 방문 기록 초기화
        for (boolean[] b : visited){
            Arrays.fill(b, false);
        }
        // 적록색약 탐색으로 전환
        changeMode = true;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (!visited[i][j]){
                    bfs(j, i);
                    bad++;
                }
            }
        }

        System.out.println(good + " " + bad);
    }

    public static void bfs(int x, int y){
        char prev = grid[y][x];
        visited[y][x] = true;
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(x, y));

        while (!Q.isEmpty()){
            Node target = Q.poll();

            for (int i = 0; i < 4; i++){
                int nx = target.x + dx[i];
                int ny = target.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[ny][nx]){
                    if (grid[ny][nx] == prev){
                        visited[ny][nx] = true;
                        Q.add(new Node(nx, ny));
                        continue;
                    }
                    // 적록색약 모드일 땐, R과 G를 같은 것으로 간주
                    if (changeMode){
                        if ((prev == 'R' && grid[ny][nx] == 'G') || (prev == 'G' && grid[ny][nx] == 'R')){
                            visited[ny][nx] = true;
                            Q.add(new Node(nx, ny));
                        }
                    }
                }
            }
        }
    }
}