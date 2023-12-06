class Solution {
    public String solution(String my_string, String alp) {
//         String answer = "";
//         String[] my_string_split = my_string.split("");
//         for (int i = 0; i < my_string_split.length; i++){
//             if (my_string_split[i].equals(alp)) {
//                 my_string_split[i] = my_string_split[i].toUpperCase();
//             }
//         }
//         for (String str : my_string_split){
//             answer += str;
//         }
        
//         return answer;
        
        // 다른 사람 풀이
        String answer = my_string.replace(alp, alp.toUpperCase());
        return answer;
        
        
    }
}