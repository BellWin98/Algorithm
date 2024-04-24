import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0,};
    static int[] dy = {0, 0, -1, 1};
    static int N; // 가로, 세로
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        // map의 높이 중 최대 높이
        int maxHeight = Integer.MIN_VALUE;

        // 안전 영역 최대 갯수
        int maxSafeZone = Integer.MIN_VALUE;

        map = new int[N][N];
        visited = new boolean[N][N];

        // map에 입력 값(높이) 세팅
        for (int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++){
                int height = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, height);
                map[i][j] = height;
            }
        }

        // 비가 안오는 상황도 고려하므로, 0부터 시작
        for (int i = 0; i <= maxHeight; i++){
            int count = 0;
            for (int j = 0; j < N; j++){
                for (int k = 0; k < N; k++){
                    // dfs 돌 때마다 count 값 1 증가 (안전 영역 카운트)
                    if (map[j][k] > i && !visited[j][k]) {
                        dfs(k, j, i);
                        count++;
                    } else {
                        visited[j][k] = true;
                    }
                }
            }

            // 최대 안전 영역 구하기
            maxSafeZone = Math.max(maxSafeZone, count);
            for (boolean[] b : visited){
                Arrays.fill(b, false);
            }
        }

        System.out.println(maxSafeZone);
    }

    public static void dfs(int x, int y, int maxHeight){
        visited[y][x] = true;

        for (int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[ny][nx] > maxHeight && !visited[ny][nx]){
                visited[ny][nx] = true;
                dfs(nx, ny, maxHeight);
            }
        }
    }
}
