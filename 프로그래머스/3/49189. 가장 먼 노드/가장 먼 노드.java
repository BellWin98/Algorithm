import java.util.*;

class Solution {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;
    public int solution(int n, int[][] edge) {
        adjList = new ArrayList<>();
        visited = new boolean[n];
        distance = new int[n];
        int answer = 0;
        for (int i = 0; i < n; i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] index : edge){
            addEdge(index[0] - 1, index[1] - 1);
        }
        bfs(0);
        System.out.println(Arrays.toString(distance));
        Arrays.sort(distance);
        int max = distance[distance.length - 1];
        for (int i = distance.length - 1; i >= 0; i--){
            if (distance[i] == max) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
    
    void bfs(int start){
        Queue<Integer> Q = new LinkedList<>();
        visited[start] = true;
        Q.add(start);
        
        while (!Q.isEmpty()){
            int prev = Q.poll();
            for (int next : adjList.get(prev)){
                if (!visited[next]){
                    visited[next] = true;
                    distance[next] = distance[prev] + 1;
                    Q.add(next);
                }
            }
        }
    }
    
    void addEdge(int start, int end){
        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }
}