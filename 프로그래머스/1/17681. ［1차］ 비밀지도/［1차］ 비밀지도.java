import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++){
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            int zeros = n - binary.length();
            for (int k = 0; k < zeros; k++){
                sb.append(" ");
            }
            for (char c : binary.toCharArray()){
                if (c == '1'){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer.add(sb.toString());
            sb.setLength(0);
        }
        return answer.toArray(new String[answer.size()]);
    }
}