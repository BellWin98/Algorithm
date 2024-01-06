import java.util.*;

class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isLowerCase(c)){
                if (c + n > 'z'){
                    sb.append((char) ('a' + n - ('z' - c) - 1));
                } else {
                    sb.append((char)(c + n));    
                }
                
            } else if (Character.isUpperCase(c)){
                if (c + n > 'Z'){
                    sb.append((char) ('a' + n - ('z' - c) - 1));
                } else {
                    sb.append((char)(c + n));   
                }
                
            } else {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}