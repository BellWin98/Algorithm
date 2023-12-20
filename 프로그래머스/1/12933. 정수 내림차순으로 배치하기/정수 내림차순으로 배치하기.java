import java.util.*;

class Solution {
    public long solution(long n) {
        String numbers = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        String[] numberSplit = numbers.split("");
        Arrays.sort(numberSplit, Comparator.reverseOrder());
        for (String number : numberSplit){
            sb.append(number);
        }
        return Long.parseLong(sb.toString());
    }
}