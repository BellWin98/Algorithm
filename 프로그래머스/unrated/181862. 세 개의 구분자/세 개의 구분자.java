import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myStr) {
        String[] strSplit = myStr.split("[a-c]");
        if (strSplit.length == 0){
            return new String[]{"EMPTY"};
        }
        return Arrays.stream(strSplit).filter(a -> !a.isEmpty()).toArray(String[]::new);
    }
}