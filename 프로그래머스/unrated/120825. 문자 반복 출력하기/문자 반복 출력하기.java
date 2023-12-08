class Solution {
    public String solution(String my_string, int n) {
        
        // 두 번째 풀이
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++){
            for (int j = 0; j < n; j++){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}

// 첫 번째 풀이
//         StringBuilder sb = new StringBuilder();
//         String[] splitStr = my_string.split("");
//         for (String str : splitStr){
//             for (int i = 0; i < n; i++){
//                 sb.append(str);
//             }
//         }  
//         return sb.toString();