import java.util.*;

class Solution {
    public int solution(String before, String after) {
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        List<String> beforeList = new ArrayList<>(Arrays.asList(beforeArr));
        List<String> afterList = new ArrayList<>(Arrays.asList(afterArr));
        for (String str : beforeList){
            if (afterList.contains(str)){
                afterList.remove(str);
            }
        }
        return afterList.isEmpty() ? 1 : 0;
    }
}