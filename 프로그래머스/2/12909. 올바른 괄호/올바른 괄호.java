import java.util.*;

class Solution {
    boolean solution(String s) {
        // String[] strArr = s.split("");
        Stack<Character> strStack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                strStack.push(s.charAt(i));
            } else {
                if (strStack.empty()){
                    return false;
                } else {
                    strStack.pop();
                }
            }
        }
        return strStack.isEmpty() ? true : false; 
    }
}