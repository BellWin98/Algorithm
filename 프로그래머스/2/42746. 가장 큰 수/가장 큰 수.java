import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        if (Arrays.stream(numbers).sum() == 0) {
            return "0";
        }
        List<String> strNumbers = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            strNumbers.add(String.valueOf(number));
        }
        strNumbers.sort((a, b) -> (b + a).compareTo(a + b));
        for (String strNumber : strNumbers) {
            sb.append(strNumber);
        }
        
        return sb.toString();
    }
}