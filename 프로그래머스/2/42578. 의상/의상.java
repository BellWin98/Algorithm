import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothMap = new HashMap<>();
        for (String[] cloth : clothes) {
            clothMap.put(cloth[1], clothMap.getOrDefault(cloth[1], 0) + 1);
        }
        for (String key : clothMap.keySet()) {
            // 종류별 옷을 선택하는 경우의 수(n) + 선택하지 않는 경우의 수(1)
            answer *= clothMap.get(key) + 1;
        }
        
        // 아무것도 선택하지 않는 경우의 수 1개 빼기
        return answer - 1; 
    }
}