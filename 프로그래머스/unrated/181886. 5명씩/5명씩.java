import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> nameList = new ArrayList<>();
        nameList.add(names[0]);
        for (int  i = 1; i < names.length; i++){
            if (i % 5 == 0){
                nameList.add(names[i]);
            }
        }
        
        String[] answer = new String[nameList.size()];
        
        for (int i = 0; i < answer.length; i++){
            answer[i] = nameList.get(i);
        }
        
        return answer;
    }
}