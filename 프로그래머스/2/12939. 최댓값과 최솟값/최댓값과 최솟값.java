import java.util.*;

class Solution {
    public String solution(String s) {
        List<Integer> numList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            numList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(numList);
        int max = numList.get(numList.size() - 1);
        int min = numList.get(0);
        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}