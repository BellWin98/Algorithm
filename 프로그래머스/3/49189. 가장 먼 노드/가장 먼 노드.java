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
        for (int[] arr : edge){
            addEdge(arr[0] - 1, arr[1] - 1);
        }
        
        bfs(0);
        int max = Arrays.stream(distance).max().getAsInt();
        int answer = (int) Arrays.stream(distance).filter(a -> a == max).count();
        // Arrays.sort(distance);
        // int max = distance[distance.length - 1];
        // for (int number : distance){
        //     if (number == max){
        //         answer++;
        //     }
        // }
        return answer;
    }
    
    void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()){
            int vertex = queue.poll();
            for (int target : adjList.get(vertex)){
                if (!visited[target]){
                    distance[target] = distance[vertex] + 1;
                    queue.add(target);
                    visited[target] = true;
                }
            }
        }
    }
    
    void addEdge(int start, int end){
        adjList.get(start).add(end);
        adjList.get(end).add(start);
    }
}