import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken()) - 1;

        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            addEdge(start, end);
        }

        // 연결되어 있는 자식 노드를 오름차순으로 정렬 (작은 번호부터 방문)
        for (List<Integer> children : adjList) {
            children.sort(Comparator.naturalOrder());
        }

        dfs(V);
        Arrays.fill(visited, false);
        System.out.println();
        bfs(V);
    }

    public static void addEdge(int start, int end) {
        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }

    public static void dfs(int root) {
        visited[root] = true;
        System.out.print(root + 1);
        for (int child : adjList.get(root)) {
            if (!visited[child]) {
                System.out.print(" ");
                dfs(child);
            }
        }
    }

    public static void bfs(int root) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(root);
        visited[root] = true;

        while (!Q.isEmpty()) {
            int index = Q.poll();
            System.out.print(index + 1);
            for (int child : adjList.get(index)) {
                if (!visited[child]) {
                    Q.add(child);
                    visited[child] = true;
                }
            }
            System.out.print(" ");
        }
    }
}
