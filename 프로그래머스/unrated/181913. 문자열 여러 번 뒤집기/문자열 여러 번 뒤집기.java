import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String[] strArr = my_string.split("");
        for (int[] arr : queries){
            int len = (arr[1] - arr[0] + 1) / 2;
            int i = arr[0];
            int j = arr[1];
            while (len > 0){
                String temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;
                i++;
                j--;
                len--;
            }
        }
        return String.join("", strArr);
    }
}