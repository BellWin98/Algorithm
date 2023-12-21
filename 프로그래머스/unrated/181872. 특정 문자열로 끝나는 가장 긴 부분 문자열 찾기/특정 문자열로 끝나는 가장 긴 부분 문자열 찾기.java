import java.util.*;

class Solution {
    public String solution(String myString, String pat) {
        // 2차 풀이
        int index = myString.lastIndexOf(pat);
        return myString.substring(0, index + pat.length());
    }
}

// 1차 풀이
// Deque<Character> deque = new ArrayDeque<>();          
// StringBuilder sbMyString = new StringBuilder();
// StringBuilder sbPat = new StringBuilder();
// String newMyString = sbMyString.append(myString).reverse().toString();
// String newPat = sbPat.append(pat).reverse().toString();
// int startIndex = newMyString.indexOf(newPat);
// for (int i = startIndex; i < newMyString.length(); i++){
//     deque.addLast(newMyString.charAt(i));
// }
// while (!deque.isEmpty()){
//     answer += deque.pollLast() + "";
// }