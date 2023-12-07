import java.util.regex.Pattern;

class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6){
            return Pattern.matches("[0-9]+", s);
        }
        return false;
    }
}