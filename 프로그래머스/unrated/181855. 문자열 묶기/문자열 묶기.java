import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (String str : strArr){
            countMap.put(str.length(), countMap.getOrDefault(str.length(), 0) + 1);
        }
        
        List<Integer> keyList = new ArrayList<>(countMap.keySet());
        keyList.sort((o1, o2) -> countMap.get(o2).compareTo(countMap.get(o1)));
        
        return countMap.get(keyList.get(0));
    }
}