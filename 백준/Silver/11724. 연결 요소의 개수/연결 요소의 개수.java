import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N; // 정점의 개수
    static int M; // 간선의 개수
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N];
        int answer = 0;

        for (int i = 0; i < N; i++){
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            addEdges(start - 1, end - 1);
        }

        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void addEdges(int start, int end){
        graph.get(start).add(end);
        graph.get(end).add(start);
    }

    public static void dfs(int node){
        visited[node] = true;

        for (int i = 0; i < graph.get(node).size(); i++){
            int next = graph.get(node).get(i);
            if (!visited[next]){
                dfs(next);
            }
        }
    }
}