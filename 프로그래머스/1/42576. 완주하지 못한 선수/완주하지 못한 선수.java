import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> resultMap = new HashMap<>();
        
        for (String s : participant){
            resultMap.put(s, resultMap.getOrDefault(s, 0) + 1);
        }
        
        for (String s : completion) {
            // 완주자 명단에 있고, 동명이인이 없을 때
            if (resultMap.containsKey(s) && resultMap.get(s) == 1){
                resultMap.remove(s);
            } else if (resultMap.containsKey(s) && resultMap.get(s) != 1) {
                resultMap.put(s, resultMap.get(s) - 1);
            }
        }
        
        for (String s : resultMap.keySet()){
            answer = s;
        }
        
        return answer;
    }
}