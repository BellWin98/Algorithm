class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder answer = new StringBuilder();
        String[] strSplit = my_string.split("");
        for (String str : strSplit){
            if (!str.equals(letter)){
                answer.append(str);
            }
        }
        return answer.toString();
    }
}