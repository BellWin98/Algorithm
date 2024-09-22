import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 1. 노드들끼리 관계 맺기
 * 2. A에서 B까지의 최단거리를 구하는 로직 같음 (BFS)
 * 3. Node 객체 생성 후 노드 번호(number), 거리(distance) 인스턴스 변수 선언
 * 4. 탐색할 때마다 distance + 1
 * 5. 전체 노드를 순회하면서 타겟 노드를 찾으면 distance + 1 반환, 못찾으면 -1 반환
 */
public class Main {

    static class Node {
        int number;
        int distance;

        Node(int number, int distance) {
            this.number = number;
            this.distance = distance;
        }
    }

    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 전체 사람 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken()) - 1;
        int Y = Integer.parseInt(st.nextToken()) - 1;
        int M = Integer.parseInt(br.readLine()); // 관계 개수
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

        System.out.println(bfs(X, Y));
    }

    public static int bfs(int start, int end) {
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(start, 0));
        visited[start] = true;

        while (!Q.isEmpty()) {
            Node parent = Q.poll();
            for (int child : adjList.get(parent.number)) {
                if (!visited[child]) {
                    if (child == end) {
                        return parent.distance + 1;
                    }
                    Q.add(new Node(child, parent.distance + 1));
                    visited[child] = true;
                }
            }
        }

        return -1;
    }

    public static void addEdge(int start, int end) {
        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }
}