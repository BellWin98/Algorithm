class Solution {
    static int answer = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++){
            dfs(computers, visited, i);
        }
        return n - answer;
    }
    
    public void dfs(int[][] computers, boolean[] visited, int start){
        visited[start] = true;
        for (int i = 0; i < computers[start].length; i++){
            if (!visited[i] && computers[start][i] == 1){
                answer++;
                dfs(computers, visited, i);
            }
        }
    }
}