import java.util.*;

class Solution {
    
    static class Node {
        int x;
        int y;
        int distance;

        Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    
    public int solution(int[][] maps) {
        int m = maps.length;
        int n = maps[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visited = new boolean[m][n];
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!Q.isEmpty()) {
            Node cur = Q.poll();
            if (cur.x == n - 1 && cur.y == m - 1) {
                return cur.distance;
            }
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[ny][nx] == 1 && !visited[ny][nx]) {
                    Q.add(new Node(nx, ny, cur.distance + 1));
                    visited[ny][nx] = true;
                }
            }
        }
        return -1;
    }
}