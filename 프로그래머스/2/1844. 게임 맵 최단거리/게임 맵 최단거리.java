import java.util.*;

class Solution {
    static boolean[][] visited;
    static int[][] distance;
    static int[][] moves;
    static int m, n;
    
    static class Node{
        int x, y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        m = maps.length;
        n = maps[0].length;
        visited = new boolean[m][n];
        distance = new int[m][n];
        moves = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < m; i++){
            Arrays.fill(distance[i], 1);
        }
        Node startNode = new Node(0, 0);
        Node endNode = new Node(m - 1, n - 1);
        int shortest = bfs(startNode, endNode, maps);
        
        return shortest == -1 ?  -1 : shortest;
    }
    
    int bfs(Node start, Node destination, int[][] maps){
        visited[start.x][start.y] = true;
        Queue<Node> Q = new LinkedList<>();
        Q.add(start);
        while(!Q.isEmpty()){
            Node node = Q.poll();
            for (int[] move : moves){
                int nx = node.x + move[0];
                int ny = node.y + move[1];
                if (nx == destination.x && ny == destination.y){
                    return distance[node.x][node.y] + 1;
                }
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && maps[nx][ny] == 1){
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[node.x][node.y] + 1;
                    Q.add(new Node(nx, ny));
                }
            }
        }
        return -1;
    }
}