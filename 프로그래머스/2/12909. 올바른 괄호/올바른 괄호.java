import java.util.*;

class Solution {
    boolean solution(String s) {
        // for문으로만 풀어보기
        // 강사님 풀이
        Deque<Character> myDeque = new ArrayDeque<>();
        boolean answer = true;
        for (int i = 0; i < s.length(); i++){
            if (myDeque.isEmpty()){
                if (s.charAt(i) == ')'){
                    answer = false;
                    break;
                }
                myDeque.addLast(s.charAt(i));
            } else {
                if (myDeque.peekLast() == '(' && s.charAt(i) == ')'){
                    myDeque.pollLast();
                } else {
                    myDeque.addLast(s.charAt(i));
                }
            }
        }
        if (!myDeque.isEmpty()){
            answer = false;
        }
        return answer;
    }
}

// 내 풀이
// Stack<Character> strStack = new Stack<>();
// for (int i = 0; i < s.length(); i++){
//     if (s.charAt(i) == '('){
//         strStack.push(s.charAt(i));
//     } else {
//         if (strStack.empty()){
//             return false;
//         } else {
//             strStack.pop();
//         }
//     }
// }
// return strStack.isEmpty() ? true : false;

