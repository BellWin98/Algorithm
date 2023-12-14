import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        int decimalBin1 = 0;
        int decimalBin2 = 0;
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int counter = 1;
        for (int i = bin1.length() - 1; i >= 0; i--){
            if (bin1.charAt(i) == '1'){
                decimalBin1 += counter;
            }
            counter *= 2;
        }
        counter = 1;
        for (int i = bin2.length() - 1; i >= 0; i--){
            if (bin2.charAt(i) == '1'){
                decimalBin2 += counter;
            }
            counter *= 2;
        }
        int decimalSum = decimalBin1 + decimalBin2;
        if (decimalSum == 0){
            return "0";
        }
        while (decimalSum != 0){
            stack.push(String.valueOf(decimalSum % 2));
            decimalSum /= 2;
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}