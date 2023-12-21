import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strSplit = my_string.split("");
        StringBuilder sb = new StringBuilder();
        Arrays.sort(indices);
        for (int idx : indices){
            strSplit[idx] = "";
        }
        for (String str : strSplit){
            if (!str.equals("")){
                sb.append(str);
            }
        }
        return sb.toString();
    }
}