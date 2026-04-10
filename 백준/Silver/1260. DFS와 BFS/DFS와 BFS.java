import java.io.*;
import java.util.*;

public class Main {

    static int[][] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }

        br.close();
        dfs(V);
        System.out.println(sb.toString().trim());
        sb.setLength(0);
        Arrays.fill(visited, false);
        bfs(V);
        System.out.println(sb.toString().trim());
    }

    public static void dfs(int node) {
        visited[node] = true;
        sb.append(node).append(" ");
        for (int i = 1; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void bfs(int node) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(node);
        visited[node] = true;
        while (!Q.isEmpty()) {
            int target = Q.poll();
            sb.append(target).append(" ");
            for (int i = 1; i < graph.length; i++) {
                if (graph[target][i] == 1 && !visited[i]) {
                    Q.add(i);
                    visited[i] = true;
                }
            }
        }


    }
}
