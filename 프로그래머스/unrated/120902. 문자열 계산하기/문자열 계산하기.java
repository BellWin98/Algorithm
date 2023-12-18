import java.util.*;

class Solution {
    public int solution(String my_string) {
        Deque<Integer> numberDeque = new ArrayDeque<>();
        String[] splitArr = my_string.split("\\s");
        String op = "";
        for (String str : splitArr){
            if (str.equals("+")){
                op = "+";
            } else if (str.equals("-")) {
                op = "-";
            } else {
                numberDeque.addLast(Integer.parseInt(str));
            }
            
            if (numberDeque.size() == 2){
                if (op.equals("+")){
                    numberDeque.addLast(numberDeque.pollFirst() + numberDeque.pollFirst());
                } else {
                    numberDeque.addLast(numberDeque.pollFirst() - numberDeque.pollFirst());
                }
            }
        }
        return numberDeque.pop();
    }
}