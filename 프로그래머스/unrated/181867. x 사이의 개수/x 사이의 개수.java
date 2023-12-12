import java.util.*;

class Solution {
    public int[] solution(String myString) {
        // split 함수의 limit인자 사용
        // limit가 0보다 작을 경우 맨 뒤의 빈값에 대해 split을 모두 진행
        String[] myStringSplit = myString.split("x", -1);
        int[] result = new int[myStringSplit.length];
        for (int i = 0; i < myStringSplit.length; i++){
            result[i] = myStringSplit[i].length();
        }
        
        return result;
    }
}