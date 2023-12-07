class Solution {
    public int solution(String num_str) {
        
        // 문자열 분리하여 문자열 배열에 저장
        String[] arr = num_str.split("");
        int answer = 0;
        
        for (String idx : arr){
            
            // 문자열 배열 순회하며 각 요소를 int형으로 변환
            answer += Integer.parseInt(idx);
        }
        return answer;
    }
}