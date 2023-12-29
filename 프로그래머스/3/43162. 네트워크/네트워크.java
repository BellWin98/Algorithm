class Solution {
    static int answer = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        // dfs(0)으로 시작하면 안됨. 전체 노드를 순회해야 함
        for (int i = 0; i < n; i++){
            dfs(computers, visited, i);
        }
        
        // 전체노드 - 간선의 개수
        return n - answer;
    }
    
    public void dfs(int[][] computers, boolean[] visited, int start){
        visited[start] = true;
        for (int i = 0; i < computers[start].length; i++){
            if (!visited[i] && computers[start][i] == 1){
                // 노드끼리 이어져있으면 간선의 개수 count
                answer++;
                dfs(computers, visited, i);
            }
        }
    }
}