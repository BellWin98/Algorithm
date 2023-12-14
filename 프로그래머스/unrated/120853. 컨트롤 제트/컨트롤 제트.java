import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> numberStack = new Stack<>();
        String[] strArr = s.split(" ");
        for (String str : strArr){
            if (str.equals("Z")){
                answer -= numberStack.peek();
                continue;
            }
            numberStack.push(Integer.parseInt(str));
        }
        while (!numberStack.isEmpty()){
            answer += numberStack.pop();
        }
        return answer;
    }
}