import java.util.*;

class Solution {
    public String solution(String s) {
        // 다른 사람 풀이 참고
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.toLowerCase().split("");
        boolean isBlank = true;
        for (String str : strArr){
            sb.append(isBlank ? str.toUpperCase() : str);
            isBlank = str.equals(" ") ? true : false; 
        }
        return sb.toString();
    }
}

// 내 풀이
// StringBuilder sb = new StringBuilder();
// s = s.toLowerCase();
// boolean isBlank = true;
// for (int i = 0; i < s.length(); i++){
//     if (s.charAt(i) == ' '){
//         isBlank = true;
//         sb.append(s.charAt(i));
//     } else if (Character.isLetter(s.charAt(i)) && isBlank){
//         sb.append(Character.toUpperCase(s.charAt(i)));
//         isBlank = false;
//     } else {
//         sb.append(s.charAt(i));
//         isBlank = false;
//     }
// }
// return sb.toString();