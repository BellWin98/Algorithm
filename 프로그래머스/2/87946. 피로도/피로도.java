import java.util.*;

class Solution {
    static int max = 0;
    public int solution(int k, int[][] dungeons) {
        List<List<int[]>> permutations = new ArrayList<>();
        boolean[] visited = new boolean[dungeons.length];
        List<int[]> temp = new ArrayList<>();
        permutation(visited, permutations, temp, dungeons, k, 0);
        return max;
    }
    
    public void permutation(boolean[] visited, List<List<int[]>> permutations, 
                            List<int[]> temp, int[][] dungeons, int k, int count){
        if (count > max){
            max = count;
        }
        // if (count == dungeons.length){
        //     permutations.add(new ArrayList<>(temp));
        //     return;
        // }
        for (int i = 0; i < dungeons.length; i++){
            if (!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                temp.add(dungeons[i]);
                permutation(visited, permutations, temp, dungeons, k - dungeons[i][1], count + 1);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}