import java.util.*;

class Node {
    int x;
    int y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Solution {
    static int[][] move = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    static int n ,m;
    static int[][] visited;
    public int solution(int[][] maps){
        n = maps.length;
        m = maps[0].length;
        visited = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], -1);
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0, 0));
        visited[0][0] = 1;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int[] direction : move) {
                int nx = node.x + direction[0];
                int ny = node.y + direction[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == -1 && maps[nx][ny] == 1) {
                    visited[nx][ny] = visited[node.x][node.y] + 1;
                    queue.add(new Node(nx, ny));
                }
            }
        }
        return visited[n -1][m - 1];
    }
}