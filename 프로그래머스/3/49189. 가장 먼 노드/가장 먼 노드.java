import java.util.*;

class Solution {
    static boolean[] visited;
    static int[] distance;
    static List<List<Integer>> adjList;
    
    public int solution(int n, int[][] edge) {
        visited = new boolean[n];
        distance = new int[n];
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] a : edge){
            addEdge(a[0] - 1, a[1] - 1);
        }
        bfs(0);
        Arrays.sort(distance);
        int max = distance[distance.length - 1];
        int count = 0;
        for (int number : distance){
            if (number == max){
                count++;
            }
        }
        return count;
    }
    
    void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll(); // 실질적으로 방문
            for (int target : adjList.get(vertex)){
                if (!visited[target]){
                    distance[target] = distance[vertex] + 1;
                    queue.add(target); // 방문 예정인 데이터를 큐에 담음
                    visited[target] = true;
                }
            }
        }
    }
    
    void addEdge(int start, int end){
        adjList.get(start).add(end);
        adjList.get(end).add(start); // 단방향으로 주어졌을 때 사용
    }
}