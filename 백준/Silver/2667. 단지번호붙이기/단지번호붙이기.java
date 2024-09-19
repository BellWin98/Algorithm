import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] map;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int groups = 0;

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        List<Integer> houses = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                map[i][j] = Character.getNumericValue(chars[j]);
            }
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    houses.add(dfs(j, i));
                    groups++;
                }
            }
        }

        Collections.sort(houses);
        System.out.println(groups);
        for (int house : houses) {
            System.out.println(house);
        }
    }

    public static int dfs(int x, int y) {

        visited[y][x] = true;
        int houseCount = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[ny][nx] && map[ny][nx] == 1) {
                houseCount += dfs(nx, ny);
            }
        }

        return houseCount;
    }
}
