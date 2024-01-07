import java.util.*;

class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        String makeNumber = "";
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                sb.append(c);
            } else {
                makeNumber += c;
                if (map.containsKey(makeNumber)){
                    sb.append(map.get(makeNumber));
                    makeNumber = "";
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}