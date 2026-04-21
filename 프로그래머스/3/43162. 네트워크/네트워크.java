class Solution {
    
    static boolean visited[];
    static int count = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, computers);
            }
        }   
        
        return count;
    }
    
    public static void dfs(int i, int[][] computers) {
        visited[i] = true;
        
        for (int j = 0; j < computers.length; j++) {
            if (i == j) {
                continue;
            }
            if (computers[i][j] == 1 && !visited[j]) {
                dfs(j, computers);
            }
        }
    }
}