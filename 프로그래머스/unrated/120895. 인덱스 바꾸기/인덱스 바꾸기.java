import java.util.*;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] my_string_split = my_string.split("");
        String result = "";
        String temp = "";
        temp = my_string_split[num1];
        my_string_split[num1] = my_string_split[num2];
        my_string_split[num2] = temp;
        for (String str : my_string_split){
            result += str;
        }
        return result;
    }
}