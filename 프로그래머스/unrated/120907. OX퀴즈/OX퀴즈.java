import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < answer.length; i++){
            String[] strSplit = quiz[i].split("\\s+");
            String ox = "";
            if (strSplit[1].equals("+")){
                ox = Integer.parseInt(strSplit[0]) + Integer.parseInt(strSplit[2]) == Integer.parseInt(strSplit[4]) ? "O" : "X";
            } else {
                ox = Integer.parseInt(strSplit[0]) - Integer.parseInt(strSplit[2]) == Integer.parseInt(strSplit[4]) ? "O" : "X"; 
            }
            answer[i] = ox;
        }
        return answer;
    }
}

