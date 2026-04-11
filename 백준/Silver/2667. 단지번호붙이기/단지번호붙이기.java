import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1 ,1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        graph = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < graph.length; i++) {
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < line.length; j++) {
                graph[i][j] = Character.getNumericValue(line[j]);
            }
        }

        br.close();

        int groups = 0;
        List<Integer> countsPerGroup = new ArrayList<>();
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                if (graph[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    countsPerGroup.add(count);
                    count = 0;
                    groups++;
                }
            }
        }
        Collections.sort(countsPerGroup);
        bw.write(groups + "\n");
        for (int count : countsPerGroup) {
            bw.write(count + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static void dfs(int i, int j) {
        visited[i][j] = true;
        count++;
        for (int k = 0; k < 4; k++) {
            int ny = i + dy[k];
            int nx = j + dx[k];
            if (ny >= 0 && nx >= 0 && ny < graph.length && nx < graph.length &&
                    graph[ny][nx] == 1 && !visited[ny][nx]) {
                dfs(ny, nx);
            }
        }
    }
}