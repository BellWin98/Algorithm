import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String dicIndex : dic){
            Map<String, Integer> spellMap = new HashMap<>();
            for (String spellIndex : spell){
                if (dicIndex.contains(spellIndex)){
                    spellMap.put(spellIndex, spellMap.getOrDefault(spellIndex, 0) + 1);
                }
            }
            if (spellMap.size() == spell.length){
                return 1;
            }
        }
        return 2;
    }
}