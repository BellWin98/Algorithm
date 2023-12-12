import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> answerList = new ArrayList<>();
        String[] temp = myString.split("x");
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i].equals("")){
                answerList.add(temp[i]);    
            }
        }
        Collections.sort(answerList);
        
        return answerList.toArray(new String[answerList.size()]);
    }
}