import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        br.close();
        dfs(1);
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    public static void dfs(int node) {
        visited[node] = true;
        for (int i = 1; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
    }
}
