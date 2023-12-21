import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] strSplit = my_string.split("");
        int cutStrLen = e - s;
        for (int i = 0; i <= cutStrLen / 2; i++){
            String temp = strSplit[s];
            strSplit[s] = strSplit[e - i];
            strSplit[e - i] = temp;
            s++;
        }
        return String.join("", strSplit);
    }
}