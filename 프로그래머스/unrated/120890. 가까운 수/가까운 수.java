import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        
        // n과 array 요소의 차의 절댓값을 map에 담기
        for (int number : array){
            diffMap.put(number, Math.abs(n - number));
        }
        
        // key 데이터들을 List에 삽입
        List<Integer> keySetList = new ArrayList<>(diffMap.keySet());
        
        // map의 value인 array 요소의 차 데이터에 따라 key를 오름차순으로 정렬
        // 중복된 value값(가장 가까운 값) 중 가장 작은 수(0번째 요소 출력)
        keySetList.sort((o1, o2) -> diffMap.get(o1).compareTo(diffMap.get(o2)));
        
        
        return keySetList.get(0);
    }
}