import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        char[][] matrix = new char[my_string.length() / m][m];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = my_string.charAt(idx++);
            }
        }
        
        for (int i = 0; i < matrix.length; i++){
            sb.append(matrix[i][c - 1]);
        }
        return sb.toString();
    }
}