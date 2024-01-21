import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> strList = new ArrayList<>();
        String[] sp = myString.split("x");
        Arrays.sort(sp);
        for (String str : sp){
            if (!str.equals("")){
                strList.add(str);
            }
        }
        return strList.toArray(new String[strList.size()]);
    }
}