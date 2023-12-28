import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        boolean isBlank = true;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                isBlank = true;
                sb.append(s.charAt(i));
            } else if (Character.isLetter(s.charAt(i)) && isBlank){
                sb.append(Character.toUpperCase(s.charAt(i)));
                isBlank = false;
            } else {
                sb.append(s.charAt(i));
                isBlank = false;
            }
        }
        return sb.toString();
    }
}