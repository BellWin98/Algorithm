import java.util.*;

class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();
        StringBuilder numberStr = new StringBuilder();
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
        
        for (char ch : numbers.toCharArray()){
            sb.append(ch);
            if (numberMap.containsKey(sb.toString())){
                numberStr.append(numberMap.get(sb.toString()));
                sb.setLength(0);
            }
        }
        return Long.parseLong(numberStr.toString());
    }
}