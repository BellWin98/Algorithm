import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> modeMap = new HashMap<>();
        if (array.length == 1){
            return array[0];
        }
        for (int idx : array) {
            if (modeMap.containsKey(idx)) {
                modeMap.put(idx, modeMap.get(idx) + 1);
            } else {
                modeMap.put(idx, 1);
            }
        }
        List<Integer> keySet = new ArrayList<>(modeMap.keySet());
        if (keySet.size() == 1){
            return keySet.get(0);
        }
        keySet.sort((o1, o2) -> modeMap.get(o2).compareTo(modeMap.get(o1)));
        if (modeMap.get(keySet.get(0)) == modeMap.get(keySet.get(1))){
            return -1;
        }
        return keySet.get(0);
    }
}