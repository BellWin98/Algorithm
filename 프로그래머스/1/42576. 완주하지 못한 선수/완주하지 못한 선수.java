import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();
        for (String participateRunner : participant) {
            participantMap.put(participateRunner, participantMap.getOrDefault(participateRunner, 0) + 1);
        }
        for (String completeRunner : completion) {
            participantMap.put(completeRunner, participantMap.get(completeRunner) - 1);
        }
        for (Map.Entry<String, Integer> entries : participantMap.entrySet()) {
            if (participantMap.get(entries.getKey()) > 0) {
                answer = entries.getKey();
            }
        }
        return answer;
    }
}