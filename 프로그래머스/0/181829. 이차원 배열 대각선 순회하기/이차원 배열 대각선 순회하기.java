class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++){
            if (i > k){
                break;
            }
            for (int j = 0; j < board[i].length; j++){
                if (i + j > k){
                    break;
                }
                answer += board[i][j];
            }
        }
        
        return answer;
    }
}

// int answer = 0;
//         for (int i = 0; i < board.length; i++){
//             for (int j = 0; j < board[i].length; j++){
//                 if (i + j <= k){
//                     answer += board[i][j];
//                 }
//             }
//         }
// return answer;