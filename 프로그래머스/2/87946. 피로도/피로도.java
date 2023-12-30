import java.util.*;

class Solution {
    
    static int answer = 0;
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        int count = 0;
        visited = new boolean[dungeons.length];
        permutation(dungeons, k, count);
        return answer;
    }
    
    public void permutation(int[][] dungeons, int k, int count){
        if (count > answer){
            answer = count;
        }
        for (int i = 0; i < dungeons.length; i++){
            if (!visited[i] && k - dungeons[i][0] >= 0){
                visited[i] = true;
                permutation(dungeons, k - dungeons[i][1], count + 1);
                visited[i] = false;
            }
        }
    }
}