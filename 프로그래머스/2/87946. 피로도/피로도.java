import java.util.*;

class Solution {
    
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        permutation(visited, dungeons, k, 0);
        return answer;
    }
    
    public void permutation(boolean[] visited, int[][] dungeons, int k, int count){
        if (count > answer){
            answer = count;
        }
        for (int i = 0; i < dungeons.length; i++){
            if (!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                permutation(visited, dungeons, k - dungeons[i][1], count + 1);
                visited[i] = false;
            }
        }
    }
}