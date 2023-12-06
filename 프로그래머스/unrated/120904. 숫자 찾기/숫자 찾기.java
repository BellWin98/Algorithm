class Solution {
    public int solution(int num, int k) {
        // 내 풀이
//         int answer = 0;
//         String numToString = Integer.toString(num);
//         int len = numToString.length();
//         String[] arr = numToString.split("");
        
//         for (int i = 0; i < len; i++){
//             int number = Integer.parseInt(arr[i]);
//             if (number == k){
//                 answer = i + 1;
//                 break;
//             }
//             if (i == len - 1){
//                 answer = -1;
//             }
//         }
//         return answer;
        
        // 다른 사람 풀이
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int answer = numStr.indexOf(kStr);
        
        return answer < 0 ? -1 : answer + 1;
    }
}