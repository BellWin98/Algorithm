import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> modeMap = new HashMap<>();
        
        // array의 크기가 1이면 배열 요소 값 그대로 반환
        if (array.length == 1){
            return array[0];
        }
        
        // array 순회하면서 데이터를 Map에 삽입
        for (int idx : array) {
            // array의 요소가 이미 Map의 key값으로 있으면 value값에 +1
            if (modeMap.containsKey(idx)) {
                modeMap.put(idx, modeMap.get(idx) + 1);
            } else { // array의 요소가 key에 없으면 value 초기값으로 1 설정
                modeMap.put(idx, 1);
            }
        }
        
        // Map은 순서가 없으므로, key를 담을 List 선언
        List<Integer> keySet = new ArrayList<>(modeMap.keySet());
        
        // Map의 key가 1개 있으면, key 값 그대로 반환 (반례: [1,1,1,1])
        if (keySet.size() == 1){
            return keySet.get(0);
        }
        
        // Map의 value를 내림차순으로 정렬
        keySet.sort((o1, o2) -> modeMap.get(o2).compareTo(modeMap.get(o1)));
        
        // 최빈값이 여러 개면 -1 반환
        if (modeMap.get(keySet.get(0)) == modeMap.get(keySet.get(1))){
            return -1;
        }
        
        return keySet.get(0);
    }
}