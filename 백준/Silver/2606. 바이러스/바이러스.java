import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int edges = Integer.parseInt(br.readLine()); // 간선 수

        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            addEdges(start, end);
        }

        for (List<Integer> children : adjList) {
            Collections.sort(children);
        }

        dfs(0);
        System.out.println(count);

    }

    public static void addEdges(int start, int end) {
        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }

    public static void dfs(int start) {

        visited[start] = true;

        for (int child : adjList.get(start)) {
            if (!visited[child]) {
                count++;
                dfs(child);
            }
        }
    }
}

