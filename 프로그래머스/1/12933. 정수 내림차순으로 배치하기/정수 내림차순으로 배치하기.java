import java.util.*;

class Solution {
    public long solution(long n) {
        List<Long> numList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            numList.add(n % 10);
            n /= 10;
        }
        numList.sort(Comparator.reverseOrder());
        for (long num : numList) {
            sb.append(num);
        }
        return Long.parseLong(sb.toString());
    }
}