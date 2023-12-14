import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-zA-Z]", " ");
        my_string = my_string.strip();
        String[] strArr = my_string.split(" ");
        System.out.println(Arrays.toString(strArr));
        for (String str : strArr){
            if (!str.equals("")){
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}

// StringBuilder sb = new StringBuilder();
// int answer = 0;
// for (int i = 0; i < my_string.length(); i++){
//     if (Character.isDigit(my_string.charAt(i))){
//         sb.append(my_string.charAt(i));
//     } else {
//         if (sb.length() == 0){
//             continue;
//         } else {
//             answer += Integer.parseInt(sb.toString());
//             sb.delete(0, sb.length());
//         }
//     }
// }
// return answer;