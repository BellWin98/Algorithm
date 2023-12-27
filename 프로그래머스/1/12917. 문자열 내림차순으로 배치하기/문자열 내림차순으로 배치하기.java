import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length / 2; i++){
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - 1 - i];
            charArr[charArr.length - 1 - i] = temp;
        }
        for (char c : charArr){
            sb.append(c);
        }
        
        return sb.toString();
    }
}