class Solution {
    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i != j && arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;
    }
}

// int count = 0;
//         for (int i = 0; i < arr.length; i++){
//             for (int j = 0; j < arr[i].length; j++){
//                 if (arr[i][j] != arr[j][i]){
//                     count++;
//                 }
//             }
//         }
//         return count == 0 ? 1 : 0;