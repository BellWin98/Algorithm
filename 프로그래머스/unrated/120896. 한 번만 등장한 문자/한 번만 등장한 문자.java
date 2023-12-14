import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> letterMap = new HashMap<>();
        String[] strArr = s.split("");
        for (String str : strArr){
            letterMap.put(str, letterMap.getOrDefault(str, 0) + 1);
        }
        List<String> keySetList = new ArrayList<>(letterMap.keySet());
        keySetList.sort((o1, o2) -> letterMap.get(o1).compareTo(letterMap.get(o2)));
        
        for (String key : keySetList){
            if (letterMap.get(key) == 1){
                sb.append(key);
            } else {
                break;
            }
        }
        String answer = "";
        String[] sortedArr = sb.toString().split("");
        Arrays.sort(sortedArr);
        for (String str : sortedArr){
            answer += str;
        }
        
        return answer;
    }
}