class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        String[] myStringSplit = my_string.split("");
        
        for (String idx : myStringSplit){
            // String.contains(): 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수
            if (answer.contains(idx)){ 
                continue;
            }
            answer += idx;
        }
        
        return answer;
    }
}