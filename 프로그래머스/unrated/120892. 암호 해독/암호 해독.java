class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int multiples = code;
        
        while (code <= cipher.length()){
            answer += cipher.charAt(code-1);
            code += multiples;
        }
        return answer;
    }
}