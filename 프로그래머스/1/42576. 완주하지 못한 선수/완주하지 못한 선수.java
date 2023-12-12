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
            } 
            // 완주자 명단에 있고, 동명이인이 있을 때
            else if (resultMap.containsKey(s) && resultMap.get(s) != 1) {
                resultMap.put(s, resultMap.get(s) - 1);
            }
        }
        
        for (String s : resultMap.keySet()){
            answer = s;
        }
        
        return answer;
    }
}

// 강사님 풀이
// for (String member : completion){
//     if (resultMap.get(member) > 1){
//         resultMap.put(member, resultMap.get(member) - 1);
//         continue;
//     }
//     if (resultMap.get(member) == 1){
//         resultMap.remove(member);
//     }
// }

// for (String member : resultMap.keySet()){
//     answer = member;
// }

// return answer;