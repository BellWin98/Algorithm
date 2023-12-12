import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> resultMap = new HashMap<>();
        for (String member : participant){
                resultMap.put(member, resultMap.getOrDefault(member, 0) + 1);
        }
        for (String member : completion){
            if (resultMap.get(member) > 1){
                resultMap.put(member, resultMap.get(member) - 1);
                continue;
            }
            if (resultMap.get(member) == 1){
                resultMap.remove(member);
            }
        }
        
        for (String member : resultMap.keySet()){
            answer = member;
        }
        
        return answer;
    }
}