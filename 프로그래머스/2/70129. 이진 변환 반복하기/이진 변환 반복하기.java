import java.util.*;

class Solution {
    public int[] solution(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int changed = 0;
        int deleted = 0;
        while (!s.equals("1")){
            for (char c : s.toCharArray()){
                if (c == '0'){
                    deleted++;
                }
            }
            s = s.replace("0", "");
            changed++;
            int temp = s.length();
            while (temp != 0){
                stack.push(temp % 2);
                temp /= 2;
            }
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
            s = new String(sb.toString());
            sb.setLength(0);
        }
        return new int[]{changed, deleted};
    }
}